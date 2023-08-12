package ch03;

public class OperatorEx1 {
    public static void main(String[] args) {
        /*
            연산자 : 연산을 수행하는 기호
            피연산자 : 연산자의 연산 수행 대상
            모든 연산자는 연산결과를 반환

            증감 연산자(++) : 피연산자의 값을 1 증가시킨다.
            감소 연산자(--) : 피연산자의 값을 1 감소시킨다.

            증감 연산자가 독립적으로 사용된 경우, 전위형과 후위형의 차이가 없다.
        */

        /*
            형변환 연산자
                : 변수 또는 상수의 타입을 다른 타입으로 변환
        */
        double d = 85.4;
        int score = (int)d;
        System.out.println("score = " + score);

        char ch = (char)65;
        System.out.println("ch = " + ch); // 유니코드 문자(6만자) -> 100만자 확장
        int i = (int)'A';
        System.out.println("i = " + i);

        int i2 = (int)1.6f;  // 반올림 되지 않고 버림
        System.out.println("i2 = " + i2);

        float f = (float) 10;
        System.out.println("f = " + f);

        /*
            자동 형변환
                : 컴파일러가 자동으로 형변환
        */

        float f2 = 1234; // float이 int보다 훨씬 큰 수를 담음, 형변환 생략 된 것
        float f3 = (float)1234; // 대입연산자의 양쪽 타입이 맞아야 함

//        int i3 = 3.14f;  큰 값을 작은 값에 넣으면 값 손실 발생, 컴파일러가 자동 형변환해주지 않음
        int i3 = (int)3.14f; // 수동형변환
        System.out.println("i3 = " + i3);

        byte b = 100; // 예외사항, byte타입으로 자동 형변환 해 줌, byte타입의 범위(-128 ~127)에 해당

        int ii = 100;
        // byte bb = i; 리터럴이 아닌 변수의 경우 어떤 값이 있는지 알 수 없기 때문에 에러 이 경우 수동형변환 필요
        byte bb = (byte)ii;
        System.out.println("bb = " + bb);
    }
}
