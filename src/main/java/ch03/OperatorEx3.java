package ch03;

public class OperatorEx3 {
    public static void main(String[] args) {
        /*
            소수점 첫 째자리에서 반올림한 정수를 반환
        */
        long result = Math.round(1.23);

        double pi = 3.141592;
        System.out.println(pi);
        System.out.println(pi * 1000);
        System.out.println(Math.round(pi * 1000));
        System.out.println(Math.round(pi * 1000) / 1000); // 3
        System.out.println(Math.round(pi * 1000) / 1000.0); // 3.142
        System.out.println((double)Math.round(pi * 1000) / 1000); // 3.142
        double shortPi = Math.round(pi * 1000) / 1000.0;
        // int / double -> double / double -> 3.142
        System.out.println("shortPi = " + shortPi);

        System.out.println(pi * 1000); // 3141.592
        System.out.println((int) (pi * 1000)); // 3141 int로 형변환 소수점 밑 자리 일부러 값손실
        System.out.println((int) (pi * 1000) / 1000.0);

        /*
            나머지 연산
            나누는 피연산자는 0이 아닌 정수만 허용(부호는 무시됨)
        */

        int x=10, y=8;
        System.out.printf("%d을 %d로 나누면, %n", x, y);
        System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);

        // 같은 결과
        System.out.println(10 % 8);
        System.out.println(10 % -8);

    }
}
