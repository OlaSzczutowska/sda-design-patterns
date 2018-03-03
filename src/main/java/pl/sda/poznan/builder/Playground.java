package pl.sda.poznan.builder;

import java.time.LocalDate;
import pl.sda.poznan.builder.Reservation.ReservationBuilder;

public class Playground {
    public static void main(String[] args) {
    //    Reservation reservation = new Reservation();
    //    reservation.setCity("Poznan");
    //    reservation.setHeadcount(199);

        ReservationBuilder rb = Reservation.builder()
                .city("Poznan")
                .headcount(100)
                .price(99d);


        rb.date(LocalDate.parse("2018-09-09"));

        Reservation build = rb.build();
        System.out.println(build);

        Reservation wroclaw = Reservation.builder()
                .date(LocalDate.parse("2018-03-03"))
                .headcount(100)
                .price(20)
                .city("Wroclaw")
                .build();
    }
}
