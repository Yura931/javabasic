package ch10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class 날짜와시간Ex1 {
    public static void main(String[] args) {
        /*
            java.util.Date
                : 날짜와 시간을 다룰 목적으로 만들어진 클래스(JDK1.0) 1995 말.. 오래되었다.
                : Date의 메서드는 거의 deprecated되었지만, 여전히 쓰이고 있다.

            java.util.Calendar
                : Date클래스를 개선한 새로운 클래스(JDK1.1). 여전히 단점이 존재.. 1997년 ..

            java.time패키지
                : Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(JDK1.8) - 1.8 나온지도 오래됐다 .. 이제 제발 좀 쓰자
                : 날짜 - LocalDate
                : 시간 - LocalTime
                : 날짜 + 시간 - LocalDateTime

            Date와 Calendar 단점 : 날짜와 시간을 함께다룬다는 문제점!
        */

        // get() Calendar Field를 통해 값을 얻어올 수 있음
        Calendar cal = Calendar.getInstance();  // 현재 날짜와 시간으로 셋팅됨
        int thisYear = cal.get(Calendar.YEAR);  // 올해가 몇년인지 알아낸다.
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막 날

        // set() 날짜와 시간 지정, 월(MONTH)이 0부터 시작한다는 점에 주의
        Calendar date1 = Calendar.getInstance();
        date1.set(2027, 7, 15); // 2017년 8월 15일(7월 아님), 월이 배열로 되어있기 때문
        date1.set(Calendar.YEAR, 2017);
        date1.set(Calendar.MONTH, 7);
        date1.set(Calendar.DATE, 15);

        // 시간 지정
        /*
        date1.set(Calendar.HOUR_OF_DAY, 10);
        date1.set(Calendar.MINUTE, 20);
        date1.set(Calendar.SECOND, 30);
        */
        Calendar date2 = Calendar.getInstance();

        System.out.println("toString(date1) = " + toString(date1));
        System.out.println("toString(date2) = " + toString(date2));

        date1.getTimeInMillis();    // 날짜시간 -> 단위가 천분의 1초, 1000 = 1촘

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000; // 초단위 계산
        System.out.println("일(day)로 게산하면" + difference / (24*60*60) + "일입니다."); // 일 단위 계산

        System.out.println();

        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();

        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        difference = Math.abs((time2.getTimeInMillis() - time1.getTimeInMillis())) / 1000;
        System.out.println("time1과 time2의 차이는 " + difference + "초 입니다.");

        String tmp = "";
        for (int i = 0; i < TIME_UNIT.length; i++) {
            System.out.println("difference = " + difference);
            tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
            System.out.println("tmp = " + tmp);
            difference %= TIME_UNIT[i];
        }

        System.out.println("시분초로 변환하면 " + tmp + "입니다.");

        /*
            clear() : Calendar객체의 모든 필드를 초기화 -> 1970년 1월 1일 00:00:00 초기화 / EPOCH TIME
                    : clear(int field) -> 특정 필드 초기화
                    : 날짜 계산전 clear() 후 사용하면 계산이 더 정확해 짐
        */

    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" +(date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일";
    }
}
