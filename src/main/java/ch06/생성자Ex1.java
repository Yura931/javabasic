package ch06;

public class 생성자Ex1 {
    public static void main(String[] args) {
        /*
            생성자 : 인스턴스가 생성될 때마다 호출되는 '인스턴스 초기화 메서드'
                  : 인스턴스 생성 시 수행할 작업(iv 초기화)에 사용

            규칙
                - 이름이 클래스 이름과 같아야 한다.
                - 리턴값이 없다.(void 안붙임)
                - 모든 클래스는 반드시 생성자를 가져야 한다.
                - 컴파일러가 기본생성자(매개변수가 없는 생성자) 생성해줌 (생성자가 없는 경우)
        */

        // iv 초기화를 조금 더 간편하게 할 수 있음
        Time t = new Time(12, 34, 56);

        // 기본 생성자, 매개변수를 갖는 생성자 둘 다 존재
        ConstructorEx ce = new ConstructorEx();
    }
}

class ConstructorEx {

    String kind;
    int number;

    // 생성자 오버로딩
    ConstructorEx() { // 기본 생성자

        // 생성자 this()
        // - 생성자에서 다른 생성자 호출할 때 사용
        // 다른 생성자 호출 시 첫 줄에서만 사용가능
        // 기본 생성자 호출 시 iv 기본값 설정, 매개변수 받는 생성자가 이미 존재하므로 iv에 값 넣는 작업을 직접 하지 않고 생성자를 호출해서 할당
        // 코드 중복 제거
        /*
            kind = "kind";
            number = 3;
        */
        this("kind", 3);
    }

    ConstructorEx(String kind, int number) { // 매개변수가 있는 생성자
        /*
            참조변수 this
                - 인스턴스 자신을 가리키는 참조변수
                - 인스턴스 메서드(생성자 포함)에서 사용가능
                - 지역변수(lv)와 인스턴스 변수(iv)를 구별할 때 사용
        */

        // this.kind는 iv, kind는 lv
        // 기본적으로 iv의 this는 생략을 하지만 매개변수와 명이 같은 경우 구분이 필요하기 때문에 this를 사용해 참조변수 인것을 알려주어야 함
        // iv와 lv 구별
        this.kind = kind;
        this.number = number;

    }

    String kind() {
        return this.kind; // this 생략 가능
        // return kind;
    }

}
