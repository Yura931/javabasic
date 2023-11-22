package java8.기초;

import java.util.*;
import java.util.stream.IntStream;

public class 비교 {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        for (int i : new int[]{20, 30}) {
            inventory.add(new Apple(10));
            inventory.add(new Apple(i));
        }
        inventory.stream().forEach(e -> System.out.println(e.getWeight()));

        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.compareTo(a2);
            }
        });

        // 자바 8을 이용하면 자연어에 더 가깝게 간단한 방식으로 코드를 구현할 수 있다.
        inventory.sort(Comparator.comparing(Apple::getWeight));
        inventory.stream().forEach(e -> System.out.println(e.getWeight()));
    }
}

class Apple implements Comparable<Apple> {
    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple other) {
        return compare(this.weight, other.getWeight());
    }

    public static int compare (int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }
}
