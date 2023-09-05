package ch12;

public class 열거형Ex1 {
    public static void main(String[] args) {
        /*
            열거형(enum)
                : 관련된 상수들을 같이 묶어 놓은 것. Java는 타입에 안전한 열거형을 제공
                : Java의 열거형은 값과 타입 모두 체크

            열거형을 정의하는 방법
                enum 열거형 이름 { 상수명1, 상수명2, ... }

            열거형의 조상 - java.lang.Enum 클래스
                : 모든 열거형은 Enum의 자손
        */

        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("(d1 == d2) = " + (d1 == d2));
        System.out.println("(d1 == d3) = " + (d1 == d3));
        System.out.println("d1.equals(d3) = " + d1.equals(d3));
//        System.out.println("(d1 > d3) = " + (d1 > d3)); 객체이기 때문에 비교연산 불가
        System.out.println("(d1.compareTo(d3)) = " + (d1.compareTo(d3)));
        System.out.println("(d1.compareTo(d2)) = " + (d1.compareTo(d2)));

        switch (d1) {
            case EAST:  // Direction.EAST라고 쓸 수 없다.
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH"); break;
            case WEST:
                System.out.println("The direction is WEST"); break;
            case NORTH:
                System.out.println("The direction is NORTH"); break;
            default:
                System.out.println("Invalid direction."); break;
        }

        Direction[] dArr = Direction.values(); // 열거형의 모든 상수를 배열로 반환

        for (Direction d : dArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal()); // ordinal()은 값이 아닌 순서를 반환
        }
    }
}

enum Direction { EAST, SOUTH, WEST, NORTH } // 하나하나가 객체, 기본형 값이 아님
