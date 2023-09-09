package ch14;

public class 람다식Ex1 {
    public static void main(String[] args) {
        /*
            람다식(Lambda Expression)
                : 함수(메서드)를 간단한 '식(expression)'으로 표현하는 방법
                : 익명 함수(이름이 없는 함수, anonymous function)
                : 함수는 일반적 용어, 메서드는 객체지향개념 용어
                : 함수는 클래스에 독립적, 메서드는 클래스에 종속적
                : 람다식은 익명 함수가 아니라 익명 객체! 자바에서는 메서드만 존재가 가능하기 때문


            Java : oop언어
            함수형 언어 JDK1.8부터 추가
        */

        // 자바는 메서드만 존재할 수 없기 때문에 객체 안에 넣은 것, 객체를 다루기 위해서는 참조변수가 필요
        Object obj = new Object() {  // 익명 클래스, 익명객체, 객체의 선언과 생성 동시에 // 람다식(익명 객체)을 다루기 위한 참조변수가 필요. 참조변수의 타입은?
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };


//        int value = obj.max(3, 5); 호출 불가, Object클래스에는 max()가 없음, // 함수형 인터페이스
    }
}