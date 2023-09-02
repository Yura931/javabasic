package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 형식화클래스Ex1 {
    public static void main(String[] args) throws ParseException {
        /*
            Decimal 10진수 숫자
            java.text 패키지의 DecimalFormat, SimpleDateFormat
                : 숫자와 날짜를 원하는 형식으로 쉽게 출력 가능(숫자, 날짜 -> 형식 문자열)
                : 형식 문자열에서 숫자와 날짜를 뽑아내는 기능(형식 문자열 -> 숫자, 날짜)
        */

        double number = 1234567.89;
        DecimalFormat df = new DecimalFormat("#.#E0"); // 지수 형식
        String result = df.format(number); // result = "1.2E6" 1.2 * 10 6제곱
        System.out.println("result = " + result);

        df = new DecimalFormat("#,###.##");
        Number num = df.parse("1,234,567.89");
        double d = num.doubleValue(); // 1234567.89
        System.out.println("d = " + d);

        System.out.println("df.format(d) = " + df.format(d));

        /* Integer.parseInt()는 콤마(,)가 포함된 문자열을 숫자로 변환 못함 */

        /*
            SimpleDateFormat
                : 날짜와 시간을 다양한 형식으로 출력할 수 있게 해준다.
                : 특정 형식으로 되어 있는 문자열에서 날짜와 시간을 뽑아낼 수도 있다.
        */

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");

        String formatResult = sdf.format(today);
        System.out.println("formatResult = " + formatResult);

        Date today2 = sdf.parse("2023-9-1");  // 문자열 -> 날짜로
        String formatResult2 = sdf2.format(today2); // 포맷 다시 바꾸고 싶을 때
        System.out.println("formatResult2 = " + formatResult2);
    }
}
