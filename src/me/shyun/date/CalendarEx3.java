package me.shyun.date;

import java.util.Calendar;

public class CalendarEx3 {

  public static void main(String[] args) {
    final int[] TIME_UNIT = {3600, 60,1};
    final String[] TIME_UNIT_NAME = {"시간 ","분 ","초 "};

    Calendar time1 = Calendar.getInstance();
    Calendar time2 = Calendar.getInstance();

    time1.set(Calendar.HOUR_OF_DAY,10);
    time1.set(Calendar.MINUTE,20);
    time1.set(Calendar.SECOND,30);

    time2.set(Calendar.HOUR_OF_DAY,20);
    time2.set(Calendar.MINUTE,30);
    time2.set(Calendar.SECOND,10);

    System.out.println(time1.get(Calendar.HOUR_OF_DAY)+"hour "+time1.get(Calendar.MINUTE)+"min "+time1.get(Calendar.SECOND)+"sec");
    System.out.println(time2.get(Calendar.HOUR_OF_DAY)+"hour "+time2.get(Calendar.MINUTE)+"min "+time2.get(Calendar.SECOND)+"sec");

    long difference = (time2.getTimeInMillis() - time1.getTimeInMillis())/1000;

    System.out.println(difference+ "초 차이");

    for (int i = 0; i < TIME_UNIT.length; i++) {
      System.out.print(difference / TIME_UNIT[i] + TIME_UNIT_NAME[i]);
      difference %=TIME_UNIT[i];
    }
    System.out.println("차이");


  }

}
