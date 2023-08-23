package ch04;

public class 조건문Ex4 {
    public static void main(String[] args) {
        /*
            임의의 정수 만들기
            Math.random() : 0.0과 1.0사이의 임의의 double값을 반환
            0.0 <= Math.random() < 1.0
        */

        int num = 0;

        for (int i = 1; i <= 20; i++) {
//            System.out.println(Math.random()); // 0.0부터 1.0 사이의 값, 정수 변환 시 0~1 사이의 값이기 때문에 0만 나옴
//            System.out.println(Math.random() * 10); // 0.0 <= x < 10.0
//            System.out.println((int)(Math.random() * 10)); // 0 <= x < 10, 0 ~ 9
            System.out.println((int)(Math.random() * 10) + 1); // 1 <= x < 11, 1 ~ 10 / + 1을 해서 얻고 싶은 값의 범위 지정
            System.out.println((int)(Math.random() * 11) -5); // -5 <= x < 6, -5 ~ 5
        }
    }
}
