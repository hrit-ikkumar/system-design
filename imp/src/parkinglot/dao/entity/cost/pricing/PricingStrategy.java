package parkinglot.dao.entity.cost.pricing;

import parkinglot.dao.entity.ticket.Ticket;

public abstract class PricingStrategy {
    private int id;
    public abstract double price(Ticket ticket);
}
