package ch04;

public class 반복문forEx1 {
    public static void main(String[] args) {
        /*
            for문
                : 조건을 만족하는 동안 블럭{}을 반복 - 반복횟수를 알 때 적합
         */
        for (int i = 1, j = 10; i <= 10; i++, j--) { // 조건식을 생략하면, true로 간주되어 무한반복 됨
            System.out.println("i=" + i + " j=" + j);
        }

        int h; // scope(범위) - 선언위치부터 선언된 블럭의 끝까지, 너무 넓지 않은 범위로 사용하는 것이 좋음
        for (h = 0; h < 10; h++) {
            System.out.println("h="+h);
        }
        System.out.println(h);

        int sum = 0;
        for (int q = 0; q < 5; q++) {
            sum += q; // sum = sum + q;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", q, sum);
        }
    }
}
