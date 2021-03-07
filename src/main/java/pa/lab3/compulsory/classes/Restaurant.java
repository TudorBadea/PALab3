package pa.lab3.compulsory.classes;

import pa.lab3.compulsory.interfaces.Classifiable;
import pa.lab3.compulsory.interfaces.Visitable;

import java.time.LocalTime;
import java.util.Map;

public class Restaurant extends Location implements Classifiable, Visitable {
    private LocalTime openingTime, closingTime;
    private int rank;

    public Restaurant(String name, Map<Location, Integer> cost, LocalTime openingTime, LocalTime closingTime, int rank) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.rank = rank;
    }
    public Restaurant(){

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
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", rank=" + rank +
                '}';
    }
}
