package ch06;

public class static메서드_인스턴스메서드Ex1 {

    // static을 변수에 사용하는 것과 메서드에 사용하는 목적이 조금 다름
    // 멤버 변수의 경우 클래스의 공통 속성에 static을 사용
    // 메서드의 경우 iv를 사용하지 않을 목적을 가졌을 때 static을 사용 - static 메서드 내에서 iv를 가지고 작업을 하는 인스턴스메서드를 호출할 수 없음, 인스턴스메서드에서 static메서드는 호출이 가능

    // 속성(멤버 변수) 중에서 공통 속성에 static을 붙인다.
    static int width = 100;
    static int height = 250;

    long a, b;

    long add() { // 인스턴스 메서드(iv를 사용)
        return a + b; // iv
    }

    // 작업에 필요한 값을 다 lv로 받음, iv 필요 없음
    static long add(long a, long b) { // 클래스 메서드(static 메서드, iv 사용x)
        return a + b; // 같은 이름인 경우 가까운 쪽, lv
    }

    // static을 붙일지 말지 결정 .. 어떤기준으로?
    // iv 사용 여부
    // 객체 = iv 묶음
    // iv를 사용하지 않을거라면 static메소드로 만들어서 클래스에서 바로 접근하도록 하는게 좋을 지도? ...

    public static void main(String[] args) {
        static메서드_인스턴스메서드Ex1.add(1, 2);  // 클래스메서드 호출
        static메서드_인스턴스메서드Ex1 s1 = new static메서드_인스턴스메서드Ex1(); // 인스턴스 생성
        s1.a = 200L;
        s1.b = 100L;
        System.out.println(s1.add()); // 인스턴스메서드 호출

        /*
            인스턴스 메서드
            - 인스턴스 생성 후, '참조변수.메서드이름()'으로 호출
            - 인스턴스 멤버(iv, im)와 관련된 작업을 하는 메서드
            - 메서드 내에서 인스턴스 변수(iv) 사용가능

            static 메서드(클래스메서드)
            - 객체생성없이 '클래스이름.메서드이름()'으로 호출
            - 인스턴스 멤버(iv, im)와 관련없는 작업을 하는 메서드
            - 메서드 내에서 인스턴스 변수(iv) 사용불가
                - 대표적으로 Math클래스의 roud(), random()등의 메서드가 있음
                - 객체생성하지 않고 메서드를 사용

            iv를 사용하느냐 사용하지 않느냐
            사용하면 인스턴스 메서드, 사용하지 않으면 static 메서드

        */
    }
}
