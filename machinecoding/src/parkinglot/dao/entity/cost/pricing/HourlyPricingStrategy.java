package parkinglot.dao.entity.cost.pricing;

import parkinglot.dao.entity.ticket.Ticket;

import java.sql.Timestamp;

public class HourlyPricingStrategy extends PricingStrategy{

    private final double HOURLY_RATE = 30.10;

    @Override
    public double price(Ticket ticket) {
        Timestamp current = new Timestamp(System.currentTimeMillis());
        Timestamp startTime = ticket.getEntryTime();
        int hours = (int) Math.floor((current.getTime() - startTime.getTime()) / 3600);
        return hours * HOURLY_RATE;
    }
}
