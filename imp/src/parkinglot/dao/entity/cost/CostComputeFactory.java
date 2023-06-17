package parkinglot.dao.entity.cost;

import parkinglot.dao.constants.CostComputerType;
import parkinglot.dao.entity.cost.computer.CostComputer;
import parkinglot.dao.entity.cost.computer.TwoWheelerCostComputer;

public class CostComputeFactory {
    public CostComputer getCostComputer(CostComputerType costComputerType) {
        switch (costComputerType) {
            case TWO_WHEELER_COST_COMPUTER:
                return new TwoWheelerCostComputer();
            default:
                return new TwoWheelerCostComputer();
        }
    }
}
