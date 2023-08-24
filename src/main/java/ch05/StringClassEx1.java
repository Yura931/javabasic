package ch05;

import java.util.Arrays;

public class StringClassEx1 {
    public static void main(String[] args) {
        /*
            String클래스는 char[]와 메서드(기능)를 결합한 것
            String클래스 = char[] + 메서드(기능)
            
            String클래스는 내용을 변경할 수 없다.(read only)
        */

        String a = "a";
        String b = "b";
        a = a + b; // 기존의 문자열이 바뀌는 것이 아닌 새로운 문자열이 만들어 짐 / 읽기만 가능!

        String str = "ABCDE"; // char[]
        char ch = str.charAt(3); // 문자열 str의 4번째 문자 'D'를 ch에 저장
        int len = str.length();
        String tmp = str.substring(1, 4); // str에서 index범위 1~4의 문자들을 반환(4는 포함되지 않음)
        char[] charArr = str.toCharArray(); // 문자열은 문자 배열로 변경
        System.out.println("charArr = " + Arrays.toString(charArr));


    }
}
