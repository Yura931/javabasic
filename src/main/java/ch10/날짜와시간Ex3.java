package ch10;

import java.util.Calendar;
import java.util.Scanner;

public class 날짜와시간Ex3 {
    public static void main(String[] args) {
        /*
            달력 만들기
        */

        String[] WEEK_DAY_NAME = {"일", "월", "화", "수", "목", "금", "토"};

        int year = 2019;
        int month = 9;

        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, - 1);

        // 첫 번째 요일이 무슨 요일인지 알아낸다.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        System.out.println("WEEK_DAY_NAME = " + WEEK_DAY_NAME[START_DAY_OF_WEEK - 1]);
        
        // eDay에 지정된 날짜를 얻어온다.
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("     " + year + "년" + month + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("   ");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if(n % 7==0) System.out.println();
        }
    }
}
