package ch03;

public class OperatorEx2 {
    public static void main(String[] args) {
        // 실수 결과를 얻고 싶은 경우 값손실이 적은 쪽으로 적절한 형변환
        int a=10, b=4;
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);

        /*
            산술 변환
                : 연산 전에 피연산자의 타입을 일치시키는 것

            1. 두 피연산자의 타입을 같게 일치시킨다.(보다 큰 타입으로 일치)
                : long + int -> long + long -> long
                : float + int -> float + float -> float
                : double + float -> double + double -> double
            2. 피연산자의 타입이 int보다 작은 타입이면 int로 변환 됨 / 오버플로우 방지
                : byte + short -> int + int -> int
                : char + short -> int + int -> int
        */

        a = 1_000_000;
        b = 2_000_000;

        long c = a * b; // 계산에서 이미 오버플로우 발생, int타입의 범위를 벗어난 결과가 c변수에 대입 됨
        System.out.println("c = " + c); // -1454759936

        c = (long)a * b; // 오버플로우 방지, 변수 중 하나를 큰 타입으로 타입변환시켜서 연산, 혹은 변수 선언시 미리 long타입으로 선언
        System.out.println("c = " + c); // 2000000000000
    }
}
