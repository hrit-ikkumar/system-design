package splitwise.dao.entity.expense;

import splitwise.dao.entity.User;
import splitwise.dao.entity.split.Split;

import java.util.List;

public abstract class Expense {
    private String id = String.valueOf(System.currentTimeMillis());
    private double amount;
    private User expensePaidBy;
    private List<Split> splits;

    public Expense(double amount, User expensePaidBy, List<Split> splits) {
        this.amount = amount;
        this.expensePaidBy = expensePaidBy;
        this.splits = splits;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getExpensePaidBy() {
        return expensePaidBy;
    }

    public void setExpensePaidBy(User expensePaidBy) {
        this.expensePaidBy = expensePaidBy;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", expensePaidBy[userName]=" + expensePaidBy.getUserName() +
                ", splits=" + splits +
                '}';
    }
}
