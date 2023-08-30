package ch07;

public class 인터페이스Ex1 {
    public static void main(String[] args) {
        /*
            인터페이스(interface)
                : 추상 메서드의 집합 - 프로그래밍 관점
                : 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public)
                : iv를 가질 수 없음, 생성자도 없음 정말 아무것도 없음!
                : 추상 메서드만 있음
                : 추상클래스와 차이가 있음

            인터페이스의 상속
                : 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
                : 다중 상속이 가능.(추상메서드는 충돌해도 문제 없음) - 충돌문제 때문에 단일상속을 허용하지만 interface는 선언부만 있는 추상메서드만 존재하기 때문에 다중상속을 받아도 충돌 위험이 없음

            인터페이스의 구현
                : 인터페이스에 정의된 추상 메서드를 완성하는 것
                : implements 키워드 사용

            인터페이스 타입 매개변수는 인터페이스 구현한 클래스의 객체만 가능
            인터페이스를 메서드의 리턴타입으로 지정할 수 있다. - 인터페이스를 구현한 객체를 반환
        */

        Unit2 u = new Fighter();
        u.move(100, 200);
        // u.attack(new Fighter()); Unit2에는 attack()이 없어서 호출 불가
        u.stop();

        Fightable f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
        // f.stop(); Fightable에는 stop()이 없어서 호출불가

        Fighter fighter = new Fighter();
        Fightable f2 = fighter.getFightable();

    }
}
class Fighter extends Unit2 implements Fightable { // Fighter클래스는 Fightable 인터페이스를 구현

    // 오버라이딩 규칙: 조상(public)보다 접근제어자가 범위가 좁으면 안된다.
    public void move(int x, int y) {
        System.out.println("[" +x+ ", "+y+"]로 이동");
    }

    public void attack(Fightable f) {
        System.out.println(f + "를 공격");
    }

    // Fighter를 생성해서 반환
    Fightable getFightable() {
        Fighter f = new Fighter();
        return f;
    }
}

abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {
    void move(int x, int y);

    void attack(Fightable fightable);
}

interface Movable {
    void move(int x, int y);
}


interface Attackable {
    void move(int x, int y);
    void attack(Unit u);
}

interface PlayingCard {
    // 상수 public static final 항상 예외없이! 그렇기 때문에 생략 가능
    public  static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();       // public abstract String getCardKind(); public abstract 생략 가능
}

abstract class AbstractFighter implements Fightable { // 인터페이스가 가진 추상메서드를 모두 구현하지 않았기 때문에 추상클래스가 됨
    public void move(int x, int y) {

    }
}
