package splitwise.service.expense.strategies;

import splitwise.dao.common.SplitType;
import splitwise.dao.entity.User;
import splitwise.dao.entity.expense.Expense;
import splitwise.dao.entity.split.Split;

import java.util.List;

public abstract class ExpenseGenerator {
    public abstract Expense generate(List<Split> splitList, User user, Double amount);
}
