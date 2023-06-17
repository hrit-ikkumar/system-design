package splitwise;

import splitwise.dao.common.Command;
import splitwise.dao.common.SplitType;
import splitwise.dao.entity.User;
import splitwise.dao.entity.split.EqualSplit;
import splitwise.dao.entity.split.PercentSplit;
import splitwise.dao.entity.split.Split;
import splitwise.repository.UserRepository;
import splitwise.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService();
        userService.setUserRepository(userRepository);

        while(true) {
            String action = scanner.next();
            Command command = Command.of(action);
            switch(command) {
                case CREATE_USER:
                    createUserCommand(scanner, userService);
                    break;
                case EXPENSE:
                    expenseCommand(scanner, userService);
                    break;
                case SHOW:
                    show(scanner, userService);
                    break;
                case QUIT:
                    return;
                default:
                    System.out.println("No expected argument found!!!");
                    break;
            }
        }
    }

    private static void show(Scanner scanner, UserService userService) {
        userService.displayUser(scanner.next());
    }

    private static void createUserCommand(Scanner scanner, UserService userService) {
        // create_user 1 user1 rajesh rajesh@gmail.com 8209062638
        // create_user 2 user2 Mohan mohan@gmail.com 8209062638
        userService.addUser(scanner.nextInt(), scanner.next(), scanner.next(), scanner.next(), scanner.next());
    }

    private static void expenseCommand(Scanner scanner, UserService userService) {
        // expense user1 100 2 user1 user2 equal

        // user who is paying
        User user = userService.getUserByUserName(scanner.next());
        // total amount
        Double amount = scanner.nextDouble();
        // no of users who has the portion in this
        int noOfUsers = scanner.nextInt();
        List<User> recieverList = new ArrayList<>();
        for(int i=0;i<noOfUsers;i++) {
            recieverList.add(userService.getUserByUserName(scanner.next()));
        }
        // split type
        SplitType splitType = SplitType.getType(scanner.next());
        // split list
        List<Split> splitList = new ArrayList<>();
        switch(splitType) {
            case EQUAL:
                    for(int i=0;i<noOfUsers;i++) {
                        splitList.add(new EqualSplit(recieverList.get(i)));
                    }
                userService.addExpense(splitList,  user, amount, SplitType.EQUAL);
                break;
            case PERCENT:
                for(int i=0;i<noOfUsers;i++) {
                    splitList.add(new PercentSplit(recieverList.get(i), scanner.nextDouble()));
                }
                userService.addExpense(splitList, user, amount, SplitType.PERCENT);
                break;
            case EXACT:
                break;
        }
    }
}
