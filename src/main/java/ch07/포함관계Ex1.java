package ch07;

public class 포함관계Ex1 {
    public static void main(String[] args) {
        /*
            포함관계
                - 클래스의 멤버로 참조변수를 선언하는 것
        */
        Circle cir = new Circle();
        cir.p.x = 0;
        cir.p.y = 2;
        cir.r = 3;
        System.out.println("cir.p.x = " + cir.p.x);
        System.out.println("cir.p.y = " + cir.p.y);
        System.out.println("cir.r = " + cir.r);
    }
}

class Circle {
    // Point 클래스를 Circle 클래스에 포함
    // 클래스의 멤버로 다른 클래스 타입의 변수를 선언하고 타입의 객체를 만들어 주는 것
    // 복잡도를 낮춰 줌
    
    Point p = new Point(); // int x, y; 를 선언하는것과 다른 구조를 가지게 됨
    int r;
}

class Point {
    int x;
    int y;
}
