package parkinglot.common.entity.cost;

import parkinglot.common.constants.CostComputerType;
import parkinglot.common.entity.cost.computer.CostComputer;
import parkinglot.common.entity.cost.computer.TwoWheelerCostComputer;

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
