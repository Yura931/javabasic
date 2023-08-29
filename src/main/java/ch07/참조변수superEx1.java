package ch07;

public class 참조변수superEx1 {
    public static void main(String[] args) {
        /*
            참조변수 super 
                - 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자)내에만 존재 / static메서드 내에서 사용불가
                - 조상의 멤버를 자신의 멤버와 구별할 때 사용
        */

        Child c = new Child();
        c.method();

        Child2 c2 = new Child2();
        c2.method();
    }
}

class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20; // this.x
    
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}

class Parent2{
    int x = 10; // super.x와 this.x 둘 다 가능 , 조상멤버이기도 하지만 내꺼이기도 함
}

class Child2 extends Parent2 {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}