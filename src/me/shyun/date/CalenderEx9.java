package me.shyun.date;

import java.util.Calendar;

public class CalenderEx9 {

  public static int[] endOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static void main(String[] args) {

    Calendar calendar = Calendar.getInstance();
    System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    System.out.println(getDayOfWeek(2020, 4, 4));
    System.out.println(dayDiff(2020, 4, 3, 2020, 4, 4));
    System.out.println(convertDateToDay(2020, 4, 4));
    System.out.println(convertDayToDate(735578));
  }

  private static String convertDayToDate(int day) {

    int year = 1;
    int month = 0;

    while (true) {
      int aYear = isLeapYear(year) ? 366 : 365;
      if (day > aYear) {
        day -= aYear;
        year++;
      } else {
        break;
      }
    }

    while (true) {
      int endDay = endOfMonth[month];

      if (isLeapYear(year) && month == 1) {
        endDay++;
      }

      if (day > endDay) {
        day -= endDay;
        month++;
      } else {
        break;
      }
    }

    return year + "-" + (month + 1) + "-" + day;
  }

  private static int dayDiff(int i, int i1, int i2, int i3, int i4, int i5) {
    return convertDateToDay(i, i1, i2) - convertDateToDay(i3, i4, i5);
  }

  private static int getDayOfWeek(int year, int month, int day) {

    return convertDateToDay(year, month, day) % 7 + 1;

  }

  private static int convertDateToDay(int year, int month, int day) {

    int numOfLeapYear = 0;

    for (int i = 1; i < year; i++) {
      if (isLeapYear(i)) {
        numOfLeapYear++;
      }
    }

    int toLastYearDaySum = (year - 1) * 365 + numOfLeapYear;

    int thisYearDaySum = 0;

    for (int i = 0; i < month - 1; i++) {
      thisYearDaySum += endOfMonth[i];
    }

    if (month > 2 && isLeapYear(year)) {
      thisYearDaySum++;
    }

    thisYearDaySum += day;

    return toLastYearDaySum + thisYearDaySum;
  }

  private static boolean isLeapYear(int year) {

    return ((year % 4 == 0) && (year % 100 != 0) || year % 400 == 0);
  }

}
