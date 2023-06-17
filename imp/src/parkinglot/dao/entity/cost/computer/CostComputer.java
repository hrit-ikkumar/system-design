package parkinglot.dao.entity.cost.computer;

import parkinglot.dao.entity.cost.pricing.PricingStrategy;
import parkinglot.dao.entity.ticket.Ticket;

public abstract class CostComputer {
    private int id;
    protected PricingStrategy pricingStrategy;

    CostComputer(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public abstract double price(Ticket ticket);
}
