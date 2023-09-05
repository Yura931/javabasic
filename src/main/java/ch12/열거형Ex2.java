package ch12;

import java.util.Arrays;

enum Direction2 {
    EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");
    // 이 상수 하나하나가 다 생성자 호출, 생성자를 추가해 주어야 한다.

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) { // 접근 제어자 private이 생략됨
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
    public String getSymbol() { return symbol; }

    public static Direction2 of(int dir) {
        if (dir < 1 || dir > 4) {
            throw new IllegalArgumentException("Invalid value : " + dir);
        }

        return DIR_ARR[dir - 1];
    }

    public Direction2 rotate(int num) {
        num = num % 4;

        if(num < 0) num += 4;
        return DIR_ARR[(value - 1 + num) % 4];
    }

    public String toString() {
        return name() + getSymbol();
    }

}
public class 열거형Ex2 {
    public static void main(String[] args) {
        /*
            열거형에 멤버 추가하기
                : 불연속적인 열거형 상수의 경우, 원하는 값을 괄호() 안에 적는다.
                : 괄호()를 사용하려면, 인스턴스 변수와 생성자를 새로 추가해 줘야 한다.
                : 열거형의 생성자는 묵시적으로 private이므로, 외부에서 객체생성 불가
        */

//        Direction2 d = new Direction2(1); 생성 불가

        for (Direction2 d : Direction2.values()) {
            System.out.printf("%s=%d%n", d.name(), d.getValue());
        }

        System.out.println();

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));

    }
}


