package ch02;

public class PrintEx1 {
    public static void main(String[] args) {
        /*
            형식화된 출력 - printf()
            println()의 단점 - 출력형식 지정 불가
            실수의 자리수 조절 불가 - 소수점 n자리만 출력하려면?
            10진수로만 출력 됨 - 8진수, 16진수로 출력하려면?

            printf()로 츌력형식 지정가능
            지시자
            %.2f : 소수점 둘째자리
            %d : 10진수
            %X : 16진수
        */

        System.out.println(10/3);
        // 실수의 결과
        System.out.println(10.0/3);
    }
}
