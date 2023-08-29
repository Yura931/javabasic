package ch07;

public class 다형성Ex1 {
    public static void main(String[] args) {
        /*
            다형성(polymorphism)
                : 여러 가지 형태를 가질 수 있는 능력
                : 조상 타입 잠조 변수로 자손 타입 객체를 다루는 것
                : 굉장한 유연성을 줌

                타입 불일치
                장점

                객체와 참조변수의 타입이 일치할 때와 일치하지 않을 때의 차이?
                : 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
                : 참조변수로 사용할 수 있는 멤버의 갯수가 달라진다.
        */

        MyTv mt = new MyTv();
        MySmartTv mst = new MySmartTv(); // 참조 변수와 인스턴스의 타입이 일치

        MyTv t = new MySmartTv();       // 조상 타입 참조변수로 자손 타입 인스턴스 참조
//        MySmartTv mstv = new MyTv();  에러. 허용 안 됨. 실제 멤버 갯수보다 더 큰 범위를 가지는 참조변수가 만들어 질 수 없음
    }
}

class MyTv {

}

class MySmartTv extends MyTv {

}


