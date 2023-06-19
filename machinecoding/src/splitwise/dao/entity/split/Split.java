package splitwise.dao.entity.split;

import splitwise.dao.common.SplitType;
import splitwise.dao.entity.User;

public abstract class Split {
    private User user;
    private double amount;

    public Split (User user, Double amount) {
        this.user = user;
        this.amount = amount;
    }

    public Split(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Split{" +
                "user[userName]=" + user.getUserName() +
                ", amount=" + amount +
                '}';
    }
}
