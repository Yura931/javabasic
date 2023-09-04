package ch11;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx2 {
    public static void main(String[] args) {
        /*
            - HashSet은 객체를 저장하기전에 기존에 같은 객체가 있는지 확인
                같은 객체가 없으면 저장하고, 있으면 저장하지 않는다.
            - boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
                equals()와 hashCode()가 오버라이딩 되어 있어야 함
        */

        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println("set = " + set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    // 객체를 구분하는 기준은 iv!
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age); // 가변인자로 받음
    }
}
