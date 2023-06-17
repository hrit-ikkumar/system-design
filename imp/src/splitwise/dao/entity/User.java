package splitwise.dao.entity;

import splitwise.dao.common.TransactionType;
import splitwise.dao.entity.expense.Expense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private int id;
    private String userName;
    private String name;
    private String mobileNo;
    private String email;

    private List<Expense> expenseList = new ArrayList<>();

    private Map<
            TransactionType,
            Map<
                User,
                Double
            >
    > transactionTotal = new HashMap<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public static UserBuilder getUserBuilder() {
        return new UserBuilder();
    }
    public static class UserBuilder {
        private User user = new User();

        public UserBuilder setId(int id) {
            this.user.id = id;
            return this;
        }
        public UserBuilder setName(String name) {
            this.user.name = name;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.user.setUserName(userName);
            return this;
        }

        public UserBuilder setMobileNo(String mobileNo) {
            this.user.mobileNo = mobileNo;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.user.setEmail(email);
            return this;
        }

        public User build() {
            return this.user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", name='" + name + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", expenseList=" + expenseList +
                ", transactionTotal=" + printIt(transactionTotal) +
                '}';
    }

    private String printIt(Map<TransactionType, Map<User, Double>> transactionTotal) {
        StringBuilder stringBuilder = new StringBuilder();

        transactionTotal.entrySet().forEach(entry -> {
            stringBuilder.append("{");

            stringBuilder.append(entry.getKey().getType() + ": ");

            stringBuilder.append("[");
            entry.getValue().entrySet().forEach(userEntry -> {
                stringBuilder.append("{");
                stringBuilder.append(userEntry.getKey().getUserName()+ ": ");
                stringBuilder.append(userEntry.getValue());
                stringBuilder.append("} ,");
            });
            stringBuilder.append("]");

            stringBuilder.append("}");
        });

        return stringBuilder.toString();
    }

    public void addExpense(Expense expense) {
        if(expenseList == null) {
            this.expenseList = new ArrayList<>();
        }
        expenseList.add(expense);
    }

    public void addTransactionTotal(TransactionType transactionType, User paidBy, Double amount) {
        if(!transactionTotal.containsKey(transactionType)) {
            this.transactionTotal.put(transactionType, new HashMap<User, Double>());
        }
        if(this.transactionTotal.get(transactionType).containsKey(paidBy) == false) {
            this.transactionTotal.get(transactionType).put(paidBy, 0d);
        }
        this.transactionTotal.get(transactionType).put(paidBy, amount + transactionTotal.get(transactionType).get(paidBy));
    }
}
