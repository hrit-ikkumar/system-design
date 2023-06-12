package parkinglot.common.entity.cost.pricing;

import parkinglot.common.entity.ticket.Ticket;

public abstract class PricingStrategy {
    private int id;
    public abstract double price(Ticket ticket);
}
