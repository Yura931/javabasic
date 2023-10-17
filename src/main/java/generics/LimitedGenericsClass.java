package generics;

import java.util.ArrayList;
class Fruit implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

interface Eatable {}

public class LimitedGenericsClass {
    public static void main(String[] args) {

        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//        FruitBox<Grape> grapeBox2 = new FruitBox<Apple>();   // 타입 불일치 에러
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); // Toy는 Fruit의 자손도아니고 Eatable을 구현한 구현체도 아니기 때문에 타입매개변수로 지정할 수 없음

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape());    // Grape는 Apple의 자손이 아님 에러
        grapeBox.add(new Grape());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("grapeBox = " + grapeBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {  // FruitBox는 Fruit의 자손이면서 Eatable을 구현한 클래스만 타입 매개변수 T에 대입될 수 있음

}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}