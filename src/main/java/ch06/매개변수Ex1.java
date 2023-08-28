package ch06;

public class 매개변수Ex1 {
    // 스택에 main 호출
    public static void main(String[] args) {
        /*
            기본형 매개변수 - 변수의 값을 읽기만 할 수 있다.(read only)
            참조형 매개변수 - 변수의 값을 읽고 변경할 수 있다.(read & write)
        */

        Data d = new Data(); // 객체 생성
        d.x = 10;            // 참조변수 d가 가르키는 객체 x의 값을 10으로
        System.out.println("main() : x = " + d.x);

        change(d.x); // d객체의 x값을 change메소드의 매개변수로 넘겨 줌
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);

        System.out.println();

        change(d); // d객체를 change메소드의 매개변수로 넘겨 줌
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x );


        System.out.println();

        Data3 d3 = new Data3();
        d3.x = 10;

        Data3 dcopy = copy(d3);
        System.out.println("d3 = " + d3.x);
        System.out.println("dcopy = " + dcopy.x);

    }

    // static 메소드 - 객체 생성 없이 호출 가능
    // 같은 클래스 내에 있기 때문에 참조변수 없이 호출 가능
    static Data3 copy(Data3 d) { // 참조형 반환타입
        Data3 tmp = new Data3(); // 새로운 객체 tmp를 생성
        tmp.x = d.x;    // d.x의 값을 tmp.x에 복사
        return tmp;     // 복사한 객체의 주소를 반환
    }

    static void change(int x) { // 기본형 매개변수 - 읽기만 가능
        x = 1000; // change 메소드의 지역변수 x
        System.out.println("change() : x = " + x);
    }

    static void change(Data d) { // 참조형 매개변수, main메소드의 지역변수 Data d 객체와 같은 주소값을 가지게 됨
        d.x = 1000; // 객체 인스턴스 변수 x의 값을 1000으로 변경; 객체를 다룰 수 있음
        System.out.println("change() : x = " + d.x);
    }
}

class Data {
    int x;
}

class Data3 {
    int x;
}
