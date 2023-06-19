package splitwise.service.expense.strategies;

import splitwise.dao.entity.User;
import splitwise.dao.entity.expense.EqualExpense;
import splitwise.dao.entity.expense.Expense;
import splitwise.dao.entity.expense.PercentExpense;
import splitwise.dao.entity.split.EqualSplit;
import splitwise.dao.entity.split.PercentSplit;
import splitwise.dao.entity.split.Split;

import java.util.List;

public class PercentExpenseGenerator extends ExpenseGenerator {

    @Override
    public Expense generate(List<Split> splitList, User user, Double amount) {

        for (Split split : splitList) {
            PercentSplit equalSplit = (PercentSplit) split;
            equalSplit.setAmount(amount * equalSplit.getPercent() / 100);
        }

        return new PercentExpense(amount, user, splitList);
    }
}
