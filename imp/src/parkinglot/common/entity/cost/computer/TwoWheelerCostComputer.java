package parkinglot.common.entity.cost.computer;

import parkinglot.common.entity.cost.pricing.HourlyPricingStrategy;
import parkinglot.common.entity.ticket.Ticket;

public class TwoWheelerCostComputer extends CostComputer{

    public TwoWheelerCostComputer() {
        super(new HourlyPricingStrategy());
    }

    @Override
    public double price(Ticket ticket) {
        return this.pricingStrategy.price(ticket);
    }
}
