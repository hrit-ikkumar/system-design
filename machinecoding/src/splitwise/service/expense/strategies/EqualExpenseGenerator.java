package splitwise.service.expense.strategies;

import splitwise.dao.entity.User;
import splitwise.dao.entity.expense.EqualExpense;
import splitwise.dao.entity.expense.Expense;
import splitwise.dao.entity.split.EqualSplit;
import splitwise.dao.entity.split.Split;

import java.util.ArrayList;
import java.util.List;

public class EqualExpenseGenerator extends ExpenseGenerator {

    @Override
    public Expense generate(List<Split> splitList, User user, Double amount) {

        for (Split split : splitList) {
            EqualSplit equalSplit = (EqualSplit) split;
            equalSplit.setAmount(amount/splitList.size());
        }

        return new EqualExpense(amount, user, splitList);
    }
}
