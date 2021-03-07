package pa.lab3.compulsory.classes;

import pa.lab3.compulsory.interfaces.Classifiable;
import pa.lab3.compulsory.interfaces.Payable;
import pa.lab3.compulsory.interfaces.Visitable;

import java.time.LocalTime;
import java.util.Map;

public class Hotel extends Location implements Classifiable, Payable, Visitable {
    private int rank;
    private LocalTime openingTime, closingTime;
    private double ticketPrice;

    public Hotel(String name, Map<Location, Integer> cost, int rank, LocalTime openingTime, LocalTime closingTime, double ticketPrice) {
        this.rank = rank;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
    }

    public Hotel() {

    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rank=" + rank +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", ticketPrice=" + ticketPrice +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
