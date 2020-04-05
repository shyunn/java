package me.shyun.date;

import java.util.Calendar;

public class CalendarEx7 {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.out.println("Usage: java CalendarEx6 2020 4");
      return;
    }

    int year = Integer.parseInt(args[0]);
    int month = Integer.parseInt(args[1]);

    Calendar startDay = Calendar.getInstance();
    Calendar endDay = Calendar.getInstance();

    startDay.set(year, month - 1, 1);
    endDay.set(year, month - 1, startDay.getActualMaximum(Calendar.DATE));

    startDay.add(Calendar.DATE, -startDay.get(Calendar.DAY_OF_WEEK) + 1);
    endDay.add(Calendar.DATE, 7 - endDay.get(Calendar.DAY_OF_WEEK));

    System.out.println("     " + args[0] + "년 " + args[1] + "월");
    System.out.println(" SU MO TU WE TH FR SA");

    for (int i = 1; startDay.before(endDay) || startDay.equals(endDay);
        startDay.add(Calendar.DATE, 1)) {

      int day = startDay.get(Calendar.DATE);
      System.out.print((day < 10) ? "  " + day : " " + day);
      if (i++ % 7 == 0) {
        System.out.println();
      }
    }


  }


}
