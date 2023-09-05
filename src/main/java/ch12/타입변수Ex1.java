package ch12;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class 타입변수Ex1 {
    public static void main(String[] args) {
        /*
            타입 변수
                : 클래스를 작성할 때, Object타입 대신 타입 변수(E)를 선언해서 사용.
                : 객체를 생성 시, 타입변수(E) 대신 실제 타입(Tv)을 지정(대입)
                : 참조 변수와 생성자의 대입된 타입은 일치해야 함
                : 제네릭 클래스간의 다형성은 성립.(대입된 타입은 일치해야 함)
                : 매개변수의 다형성도 성립

                매개변수화 된 타입
        */

        ArrayList<Tv> tvList = new ArrayList<Tv>(); // 참조 변수와 생성자의 대입된 타입은 일치해야 함, JDK1.7부터 생성자에 타입지정 생략가능
        tvList.add(new Tv());
        Tv list = tvList.get(0); // 타입이 일치하게 되며 형변환을 하지 않아도 됨

        ArrayList<Product> productList = new ArrayList<Product>();

        productList.add(new Tv());
        productList.add(new Audio());

        printAll(productList);

        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("자바왕", 1, 1));
        studentList.add(new Student("자바짱", 1, 2));
        studentList.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = studentList.iterator();  // generics 사용하지 않으면 형변환 필요
        while (it.hasNext()) {
            System.out.println(it.next().name);
        }
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}


class Product {}
class Tv extends Product {}
class Audio extends Product {}
