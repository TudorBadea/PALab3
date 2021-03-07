package pa.lab3.compulsory.classes;

import pa.lab3.compulsory.interfaces.Payable;
import pa.lab3.compulsory.interfaces.Visitable;

import java.time.LocalTime;
import java.util.Map;

public class Museum extends Location implements Visitable, Payable {
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Museum(String name, Map<Location, Integer> cost, LocalTime openingTime, LocalTime closingTime, double ticketPrice) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
    }
    public Museum(){

    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Museum{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
