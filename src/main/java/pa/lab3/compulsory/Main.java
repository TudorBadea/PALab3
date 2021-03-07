package pa.lab3.compulsory;

import pa.lab3.compulsory.classes.*;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        City city = new City();

        Hotel v1 = new Hotel();
        v1.setOpeningTime(LocalTime.of(8,0));
        v1.setClosingTime(LocalTime.MIDNIGHT);
        v1.setTicketPrice(150);
        v1.setRank(1);

        Museum v2 = new Museum();
        v2.setOpeningTime(LocalTime.of(10,0));
        v2.setClosingTime(LocalTime.of(20,0));
        v2.setTicketPrice(10);

        Museum v3 = new Museum();
        v3.setOpeningTime(LocalTime.of(9, 30));
        v3.setClosingTime(LocalTime.of(20,0));
        v3.setTicketPrice(20);

        Church v4 = new Church();
        v4.setOpeningTime(LocalTime.of(7, 0));
        v4.setClosingTime(LocalTime.MIDNIGHT);

        Church v5 = new Church();
        v5.setOpeningTime(LocalTime.of(6,0));
        v5.setClosingTime(LocalTime.MIDNIGHT);

        Restaurant v6 = new Restaurant();
        v6.setOpeningTime(LocalTime.of(8,0));
        v6.setClosingTime(LocalTime.parse("23:00"));
        v6.setRank(2);

        city.addLocation(v1);
        city.addLocation(v2);
        city.addLocation(v3);
        city.addLocation(v4);
        city.addLocation(v5);
        city.addLocation(v6);

        System.out.println(city);

    }
}
