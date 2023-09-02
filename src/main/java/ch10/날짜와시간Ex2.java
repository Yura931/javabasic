package ch10;

import java.util.Calendar;
import java.util.Date;
import java.util.StringJoiner;

public class 날짜와시간Ex2 {
    public static void main(String[] args) {
        // add() : 특정 필드의 값을 증가 또는 감소(다른 필드에 영향 o)
        Calendar date = Calendar.getInstance();
        date.clear();
        date.set(020, 7, 31);      // 2020년 8월 31일 설정
        date.add(Calendar.DATE, +1);        // date에 1을 더해 9월 1일이 되어 MONTH 필드에 영향을 줌
        date.add(Calendar.MONTH, -8);
        System.out.println("add toString(date) = " + 날짜와시간Ex1.toString(date));

        // roll() : 특정필드의 값을 증가 또는 감소(다른 필드에 영향X)
        date.set(2020, 7, 31);
        date.roll(Calendar.DATE, 1);
        date.roll(Calendar.MONTH, -8);
        System.out.println("roll toString(date) = " + 날짜와시간Ex1.toString(date)); // 2020년 12월 1일
        
        Calendar cal1 = Calendar.getInstance();
        Date d1 = new Date(cal1.getTimeInMillis()); // Calendar -> Date 변환 // Date(long date)
        
        Date d2 = new Date();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(d2);                           // Date -> Calendar 변환
    }
}
