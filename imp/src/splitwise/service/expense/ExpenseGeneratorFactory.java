package splitwise.service.expense;

import splitwise.dao.common.SplitType;
import splitwise.service.expense.strategies.EqualExpenseGenerator;
import splitwise.service.expense.strategies.ExpenseGenerator;
import splitwise.service.expense.strategies.PercentExpenseGenerator;

public class ExpenseGeneratorFactory {
    public static ExpenseGenerator get(SplitType splitType) {
        switch (splitType) {
            case EQUAL:
                return new EqualExpenseGenerator();
            case PERCENT:
                return new PercentExpenseGenerator();
            default:
                return new EqualExpenseGenerator();
        }
    }
}
