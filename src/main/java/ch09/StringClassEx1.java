package ch09;

public class StringClassEx1 {
    public static void main(String[] args) {
        /*
            String클래스 = 데이터(char[]) + 메서드(문자열 관련)
                : 문자열을 다루기 위한 클래스
                : 내용을 변경할 수 없는 불변(immutable) 클래스
                : 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐(새로운 문자(객체)가 계속 생겨나게 되는 것)
                : 문자열의 결합이나 변경이 잦다면, 내용을 변경가능한 StringBuffer를 사용


            문자열 리터럴
                : 문자열 리터럴은 프로그램 실행 시 자동으로 생성된다.(constant pool에 저장)
                : 같은 내용의 문자열 리터럴(상수)은 하나만 만들어진다.

            빈 문자열("", empty string)
                : 내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
                : 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
                : 문자(char)와 문자열(String)의 초기화
                
        */

        String a = "a";
        String b = "b";
        a = a + b;

        String str1 = "abc";    // 문자열 리터럴 "abc"의 주소가 str1에 저장됨
        String str2 = "abc";    // 문자열 리터럴 "abc"의 주소가 str2에 저장됨
        String str3 = new String("abc");    // 새로운 String인스턴스를 생성, 내용이 같아도 항상 새로운 주소가 만들어 짐
        String str4 = new String("abc");    // 새로운 String인스턴스를 생성

        System.out.println("str1 == str2 = " + str1 == str2);
        System.out.println("str3 == str4 = " + str3 == str4);

        // 값 비교는 내용을 비교하는 equals를 사용! 등가비교 연산자는 주소비교!

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str3.equals(str4) = " + str3.equals(str4));

        char[] chArr = new char[0];
        int[] iArr = {};

        // 초기화 권장 방법
        String s = "";  // 빈 문자열로 초기화
        char c = ' ';   // 공백으로 초기화
                

    }
}
