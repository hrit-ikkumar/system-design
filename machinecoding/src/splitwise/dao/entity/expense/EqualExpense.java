package splitwise.dao.entity.expense;

import splitwise.dao.entity.User;
import splitwise.dao.entity.split.Split;

import java.util.List;

public class EqualExpense extends Expense{
    public EqualExpense(double amount, User expensePaidBy, List<Split> splitList) {
        super(amount, expensePaidBy, splitList);
    }
}
