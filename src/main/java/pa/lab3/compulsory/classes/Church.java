package pa.lab3.compulsory.classes;

import pa.lab3.compulsory.interfaces.Visitable;
import java.time.LocalTime;
import java.util.Map;

public class Church extends Location implements Visitable {
    private LocalTime openingTime, closingTime;

    public Church(String name, Map<Location, Integer> cost, LocalTime openingTime, LocalTime closingTime) {
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public Church(){

    }

    @Override
    public LocalTime getOpeningTime() {
        return openingTime;
    }

    @Override
    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    @Override
    public String toString() {
        return "Church{" +
                "openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
