package ch07;

public class 참조변수Ex1 {
    public static void main(String[] args) {
        /*
            기본변수의 형변화은 값이 바뀜

            참조변수의 형변환 (주소값, 객체가 바뀌는 것이 아님!)
                : 사용할 수 있는 멤버의 갯수를 조절하는 것
                : 조상, 자손 관계의 참조변수 경우에만 서로 형변환 가능(형제관계 없음)
        */

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        // 사용할 수 있는 멤버를 줄였다 늘렸다 ~
        fe.water();
        car = fe; // 5개의 멤버를 가지고 있는 fe(FireEngine) 객체를 4개의 멤버를 가지고 있는 Car타입에 대입하는 것이기 때문에 5개 -> 4개 감소는 안전한 형변환이다.
                   // 그러므로 명시해주지 않아도 자동 형변환 됨!

        fe2 = (FireEngine) car; // 4개의 멤버를 가지고 있는 car(Car) 객체를 5개의 멤버를 가지고 있는 FireEngine타입에 대입하는 것이기 때문에 4개 -> 5개 증가는 안전하지 않은 형변환이다.
                                          // 그러므로 형변환을 명시해주어야 한다! 새로 늘어난 것을 실제 객체가 쓸 수 있는 것인지 알 수 없음!
                                          // 안전하지 않다는 것을 알고 사용하라는 의미
        fe2.water();

        // 형변환 시, 실제 인스턴스가 무엇인지가 중요!
        Car c = new Car(); // 4개의 멤버를 가지고 있는 Car 인스턴스
        FireEngine f = (FireEngine) c; // 자손, 부모 관계이므로 형변환자체는 에러가 없음 / 실행 시 에러! ClassCastException...
        fe.water(); // FireEngine으로 형변환 되었으므로 water()메서드 호출까지 컴파일 오케이, 하지만 실제로 Car인스턴스 안에 water객체가 없음 .. 실행 시 형변환 에러가 남!
                    // null타입만 따질 것이 아니라 참조변수가 실제 가리키고 있는 인스턴스가 무엇인지 알아야하고 그 인스턴스가 가지고 있는 멤버의 갯수를 넘어서면 안된다! 주의 ..!

    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}

class Ambulance extends Car {}
