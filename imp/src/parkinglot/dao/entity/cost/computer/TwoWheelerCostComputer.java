package parkinglot.dao.entity.cost.computer;

import parkinglot.dao.entity.cost.pricing.HourlyPricingStrategy;
import parkinglot.dao.entity.ticket.Ticket;

public class TwoWheelerCostComputer extends CostComputer{

    public TwoWheelerCostComputer() {
        super(new HourlyPricingStrategy());
    }

    @Override
    public double price(Ticket ticket) {
        return this.pricingStrategy.price(ticket);
    }
}
