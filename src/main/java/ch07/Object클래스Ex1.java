package ch07;

public class Object클래스Ex1 {
    public static void main(String[] args) {
        /*
            Object클래스 - 모든 클래스의 최고 조상
            
            - 부모가 없는 클래스는 자동적으로 Object클래스를 상속받게 된다.
                컴파일러가 extends Object를 자동으로 추가 해줌 ( 부모가 없는 경우! )
            - 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
            - toString(), equals(Object obj), hashCode(), ...
        */

        MyClass mc = new MyClass();
        System.out.println(mc.toString()); // toString()메서드를 MyClass에 구현 된 기능이 아니지만 자동적으로 Object를 상속받아 사용할 수 있게 되는 것
        System.out.println(mc); // println : 참조변수가 들어오면 내부적으로 toString()을 호출
        System.out.println(mc.getClass());
    }
}

// 컴파일 하면 extends Object가 추가 됨
class MyClass {

}
