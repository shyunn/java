package me.shyun.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class NewTimeEx1 {

  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    LocalTime now = LocalTime.now();

    LocalDate birthDate = LocalDate.of(1987, 9, 29);
    LocalTime birthTime = LocalTime.of(00, 1, 1);

    System.out.println("today=" + today);
    System.out.println("now=" + now);
    System.out.println("birthDate=" + birthDate);
    System.out.println("birthTime=" + birthTime);

    System.out.println(birthDate.withYear(2000));
    System.out.println(birthDate.plusDays(1));
    System.out.println(birthTime.plus(1, ChronoUnit.HOURS));

    System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

    System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range());
    System.out.println(ChronoField.HOUR_OF_DAY.range());

    System.out.println(today.isAfter(birthDate));
    System.out.println(today.isBefore(birthDate));

    System.out.println(LocalDate.parse("2111-01-01"));

    OffsetDateTime now1 = OffsetDateTime.now();
    Instant now2 = Instant.now();
    System.out.println(now1);
    System.out.println(now2);


  }

}
