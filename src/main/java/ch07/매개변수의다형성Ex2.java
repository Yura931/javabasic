package ch07;

import java.util.Vector;

public class 매개변수의다형성Ex2 {
    public static void main(String[] args) {
        /*
            여러 종류의 객체를 배열로!
                 : 조상타입의 배열에 자손들의 객체를 담을 수 있다.
        */

        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;

    Product[] cart = new Product[10];

    int i = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;


        String className = p.getClass().getName();
        System.out.println(className.substring(className.indexOf(".") + 1) + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i =0; i <cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            String className = cart[i].getClass().getName();
            itemList += className.substring(className.indexOf(".") + 1) + ", ";
        }
        System.out.println("구입하신 물품의 총금액은" + sum + "만원입니다.");
        System.out.println("구입하신 제품은" + itemList + "입니다.");
    }
}
