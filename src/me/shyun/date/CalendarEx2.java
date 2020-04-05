package me.shyun.date;

import java.util.Calendar;

public class CalendarEx2 {

  public static void main(String[] args) {

    //Calendar 의 요일은 1부터 시작
    final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};

    Calendar date1 = Calendar.getInstance();
    Calendar date2 = Calendar.getInstance();

    date1.set(2020,3,3);
    System.out.println("data1 은" +toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
    System.out.println("data2 은" +toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);


    //두 날짜간 차이
    long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;

    System.out.println(difference + "초 차이");
    System.out.println(difference/(60*60*24)  + "일 차이");

  }

  public static String toString(Calendar date) {
    return date.get(Calendar.YEAR)+"년 "+(date.get(Calendar.MONTH)+1)+"월 "+ date.get(Calendar.DATE)+"일 ";
  }

}
