package parkinglot.common.entity.cost.computer;

import parkinglot.common.entity.cost.pricing.PricingStrategy;
import parkinglot.common.entity.ticket.Ticket;

public abstract class CostComputer {
    private int id;
    protected PricingStrategy pricingStrategy;

    CostComputer(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public abstract double price(Ticket ticket);
}
