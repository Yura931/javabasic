package ch07;

public class 매개변수의다형성Ex1 {
    public static void main(String[] args) {
        /*
            다형성의 장점
                - 다형적 매개변수
                - 하나의 배열로 여러종류 객체 다루기

            참조형 매개변수는 메서드 호출 시, 자신과 같은 타입 또는 자손타입의 인스턴스를 넘겨줄 수 있다.

            * 다형성 복습
                Tv t = new SmartTv(); 조상타입 참조변수로 자손타입 다루기
                참조변수의 형변환 - 사용가능한 멤버갯수 조절
                instanceof 연산자 - 형변환 가능 여부 체크
        */

        Buyer b = new Buyer();
        b.buy(new Tv2());
        b.buy(new Computer());


        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보녀스점수는 " + b.bonusPoint + "점입니다.");
    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv2 extends Product {
    Tv2() {
        super(100);
    }
}
class Computer extends Product {
    Computer() {
        super(200);
    }
}
class Audio extends Product {
    Audio() {
        super(300);
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // 메서드 목적이 제품을 샀을 때 money와 bonusPoint 값을 변환하는 것인데 제품 수가 늘어나면 제품별로 오버로딩메서드를 계속 생성해야하는 중복코드가 발생하게 됨
    /*
    void buy(Tv2 t) {
        money -= t.price;
        bonusPoint += t.bonusPoint;
    }

    void buy(Computer c) {
        money -= c.price;
        bonusPoint += c.bonusPoint;
    }
    */
    // 자손객체를 넘기지 않고 조상객체를 매개변수로 받아 다형성에 의해 자손을 다 받을 수 있도록 설계하는 것이 더 옳은 방향
    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;

        String className = p.getClass().getName();
        System.out.println(className.substring(className.indexOf(".") + 1) + "을/를 구입하셨습니다.");
    }
}
