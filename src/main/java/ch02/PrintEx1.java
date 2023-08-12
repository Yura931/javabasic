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

        System.out.printf("age:%d year:%d\n", 14, 2017);
        System.out.printf("age:%d%n", 14); // \n %n 둘 다 개행문자, os에 영향 없는 %n 사용 권장

        System.out.printf("%d%n", 15); // decimal
        System.out.printf("%o%n", 15); // octal
        System.out.printf("%#X%n", 15); // hexa
        System.out.printf("%s%n", Integer.toBinaryString(15)); // 2진수
        
        // 8진수와 16진수에 접두사 붙이기, 지시자 앞에 #을 붙여 사용하면 접두사가 함께 출력 됨
        System.out.printf("%#o%n", 15);
        System.out.printf("%#x%n", 15);
        System.out.printf("%#X%n", 15);
        
        // 보통 실수는 지시자 %f, 숫자에 0이 많은 경우 %e 사용
        float f = 123.4567890f;
        double d = 123.456789;
        System.out.printf("%f%n", f); // 123.456787 float의 정밀도는 7, 앞의 7자리까지만 값이 정확, 뒤의 숫자는 의미가 없는 숫자, 정밀도가 더 높은 double(정밀도 15자리) 사용하는 것이 더 적합
        System.out.printf("%f%n", d);
        System.out.printf("%e%n", f); // 1.234568e+02 지수형식
        System.out.printf("%g%n", 123.456789);
        System.out.printf("%g%n", 0.00000001);

        //
        System.out.printf("[%5d]%n", 10); // 5자리 출력 남는 공간은 공백처리
        System.out.printf("[%5d]%n", 1234567); // 지정한 자리수보다 큰 경우 무시하고 전부 출력
        System.out.printf("[%-5d]%n", 10); // 왼쪽정렬
        System.out.printf("[%05d]%n", 10); // 공백자리 0으로 채움

        double d2 = 1.23456789;
        System.out.printf("%14.6f%n", d2);
        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com");

    }   
}
