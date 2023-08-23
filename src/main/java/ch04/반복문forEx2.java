package ch04;

public class 반복문forEx2 {
    public static void main(String[] args) {
        /*
            중첩 for문
                : for문 내에 도 다른 for문을 포함시킬 수 있다.
        */
        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i*j));
            }
            System.out.println();
        }

        // i = 1, 2, 3, 4, 5 5번 {}안의 내용을 반복
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
