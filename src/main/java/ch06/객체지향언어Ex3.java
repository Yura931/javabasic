package ch06;

// 클래스 영역
public class 객체지향언어Ex3 {


    int iv;         // 인스턴스 변수 : 인스턴스가 생성되었을 때 생성, 개별속성
    static int cv; // 클래스 변수(static변수, 공유변수) : 클래스가 메모리에 올라갈 때(클래스가 필요할 때) 생성, 공통속성
    // cpu - ram(메모리) - SSD, HDD에 있는 class파일을 RAM에 로딩, 그 후에 CPU가 읽을 수 있음, CPU는 RAM하고만 작업
    // 작업을 하려면 메모리에 올라가야 함!
    // 클래스 변수는 이 메모리에 올라 갈 때 자동으로 생성되는 것

    public static void main(String[] args) {
        int lv = 0; // 지역 변수 : 변수 선언문이 수행되었을 때
        /*
            클래스 == 데이터 + 함수
            1. 변수 : 하나의 데이터를 저장할 수 있는 공간
            2. 배열 : 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
            3. 구조체 : 서로 관련된 여러 데이터(종류 관계없이)를 하나로 저장할 수 있는 공간
            4. 클래스 : 데이터와 함수의 결합(구조체 + 함수) / 데이터와 관련 있는 함수를 묶어놓자!
                함수 : 하나의 역할을 하는 명령문 묶음

            사용자 정의 타입 - 원하는 타입을 직접 만들 수 있다.
        */
        Time t = new Time(); // 시간을 정의하는 정의서 Time 클래스를 만들고 다루기 위한 객체 생성 / 참조변수
        t.hour = 12;
        t.minute = 34;
        t.second = 56;

        Card c1 = new Card();
        // iv는 객체마다 하나씩
        c1.kind = "HEART";
        c1.number = 5;

        // cv 사용시 클래스명을 통해 접근, 참조변수 권장안함
        // cv는 하나의 공간에
        Card.width = 200;
        Card.height = 300;

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은" + c1.kind + ", " + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");

    }
}

// 시간을 다루는 타입 -> 이것이 바로 사용자 정의 타입
// 관련된 값들을 강하게 묶을 수 있다.
class Time {
    int hour;
    int minute;
    int second;

    Time() {}
    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}

class Card {
    String kind;
    int number;

    static int width = 100;
    static int height = 250;
}
