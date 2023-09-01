package ch09;

public class ObjectClassEx1 {
    public static void main(String[] args) {
        /*
            Object클래스
                : 모든 클래스의 최고 조상. 오직 11개의 메서드만을 가지고 있다.
                : notify(), wait() 등은 쓰레드와 관련된 메서드이다.

            equals(Object obj)
                : 객체 자신(this)과 주어진 객체(obj)를 비교한다. 같으면 true, 다르면 false.
                : Object클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)

            equals(Object obj)의 오버라이딩
                : 인스턴스 변수(iv)의 값을 비교하도록 equals()를 오버라이딩해야 한다.
                : 객체가 다르다는 것은 iv의 값이 다르다는 것, cv는 객체마다 공통, iv는 객체마다 다름

            클래스를 새로 만들 때 equals()를 iv 값을 비교하도록 오버라이딩 하는 것이 좋다.
        */

        Value v1 = new Value(10);
        Value v2 = new Value(10);

        // equals를 오버라이딩해서 iv비교하는 기능으로 재정의 후 사용
        System.out.println(v1.equals(v2));

    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    // Object의 equals()를 오버라이딩해서 주소가 아닌 value 비교
    public boolean equals(Object obj) {
        if (!(obj instanceof Value)) {
            return false;
        }

        return this.value == ((Value)obj).value;
    }
}
