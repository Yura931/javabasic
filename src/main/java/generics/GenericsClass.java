package generics;

import java.util.ArrayList;

public class GenericsClass {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();    // String타입만 저장할 수 있는 Box
        stringBox.setItem("ABC");
        String strItem = stringBox.getItem();
        System.out.println("strItem = " + strItem);

        GenericBox<Integer> intBox = new GenericBox<>();  // Integer타입만 저장할 수 있는 Box
        intBox.setItem(1);
        int intItem = intBox.getItem();
        System.out.println("intItem = " + intItem);

        GenericBox<Number> numBox = new GenericBox<Number>();
        GenericBox<Integer> integerBox = new GenericBox<Integer>();

        // 정수, 실수, Long타입 다 담을 수 있음
        numBox.add(1L);
        numBox.add(1.1);
        numBox.add(1);

        // int만 가능
//        integerBox.add(1L);
        integerBox.add(33);

        System.out.println("numBox = " + numBox);
        System.out.println("integerBox = " + integerBox);
    }
}

class GenericBox<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

    ArrayList<T> list = new ArrayList<T>();

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

