package splitwise.service;

import splitwise.dao.common.SplitType;
import splitwise.dao.common.TransactionType;
import splitwise.dao.entity.User;
import splitwise.dao.entity.expense.Expense;
import splitwise.dao.entity.split.Split;
import splitwise.repository.UserRepository;
import splitwise.service.expense.ExpenseGeneratorFactory;
import splitwise.service.expense.strategies.ExpenseGenerator;

import java.util.List;
import java.util.Optional;

public class UserService {
    private UserRepository userRepository;

    public void addUser(int id, String userName, String name, String email, String mobileNo) {
        User user = User.getUserBuilder()
                .setId(id)
                .setName(name)
                .setEmail(email)
                .setMobileNo(mobileNo)
                .setUserName(userName)
                .build();
        userRepository.addUser(user);
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByUserName(String userName) {
        Optional<User> optionalUser = userRepository.getUsers().stream().filter(user -> user.getUserName().equals(userName)).findFirst();
        return optionalUser.orElse(null);
    }

    public void displayUser(String userName) {
        User user = getUserByUserName(userName);
        if(user == null) {
            System.out.println("User does not exist!!!");
            return;
        }
        System.out.println(user.toString());
    }

    public void addExpense(List<Split> splitList, User user, Double amount, SplitType splitType) {

        ExpenseGenerator expenseGenerator = ExpenseGeneratorFactory.get(splitType);
        Expense expense = expenseGenerator.generate(splitList, user, amount);

        user.addExpense(expense);

        expense.getSplits().forEach(split -> {
            User receiver = split.getUser();
            if(receiver.getUserName().equals(user.getUserName())) {
                user
                    .addTransactionTotal(TransactionType.SELF, user, split.getAmount());
            } else {
                user
                    .addTransactionTotal(TransactionType.PAID, split.getUser(), split.getAmount());
                split.getUser()
                        .addTransactionTotal(TransactionType.OWE, user, split.getAmount());
            }
        });
    }
}
