package ch02;

public class VarEx3 {
    public static void main(String[] args) {
        final int score = 100; // 선언과 동시에 초기화
//        score = 200;
        boolean power = false;

        byte b = 127; // -128~127

        System.out.println(power);
        System.out.println(b);

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16
        long l = 10_000_000_000L;

        float f = 3.14f;
        double d = 3.14f; // double이 float보다 더 넓은 범위

        System.out.println("oct = " + oct);
        System.out.println("hex = " + hex);

        System.out.println("f = " + f);
        System.out.println("d = " + d);

        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);

        char ch = 'A';
        int i = 'A'; // 문자 A의 문자코드가 저장 됨
        System.out.println("ch = " + ch);
        System.out.println("i = " + i);

        String str = ""; // 빈 문자열(empty string)
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;
        System.out.println("str4 = " + str4);
    }
}
