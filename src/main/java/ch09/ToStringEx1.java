package ch09;

import java.util.Objects;

public class ToStringEx1 {
    public static void main(String[] args) {
        /*
            toString()
                : 객체를 문자열(String)으로 변환하기 위한 메서드

                getClass().getName() + "@" + Integer.toHexString(hashCode());
                객체.클래스이름@16진수객체주소

                오버라이딩해서 주소보다는 iv출력하도록 재정의
                -> 객체는 iv집합이므로!
                -> iv를 문자열로 바꾼다는 의미

                equals를 오버라이딩 하면 hashcode도 오버라이딩 해줘야 한다!
                equals가 true라면 hashcode도 true가 나오도록 해야 한다!
        */

        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));

        System.out.println("c1.hashCode() = " + c1.hashCode());
        System.out.println("c2.hashCode() = " + c2.hashCode());

    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
    public int hashCode() {
        return Objects.hash(kind, number); // 매개변수가 가변인자(Object...)라서 호출 시 지정하는 값의 개수가 정해져있지 않다.
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;

        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    public String toString() {
        return "kind:" + kind + ", number:" + number;
    }
}
