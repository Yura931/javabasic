package ch07;

public class 내부클래스Ex1 {
    public static void main(String[] args) {
        /*
            내부 클래스의 장점
                : 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
                : 코드의 복잡성을 줄일 수 있다.(캡슐화)
                : 내부 클래스의 종류와 유효범위(scope)는 변수와 동일
                : 내부 클래스의 제어자는 변수에 사용 가능한 제어자와 동일
        */

        외부클래스 외부 = new 외부클래스(); // 외부클래스의 인스턴스를 먼저 생성해야 인스턴스 클래스의
        외부.myMethod();
        외부클래스.내부클래스 내부 = 외부.new 내부클래스(); // 인스턴스를 생성 가능
        외부클래스.스태틱내부클래스 스태틱클래스 = new 외부클래스.스태틱내부클래스(); // 스태틱 클래스의 경우 외부클래스 객체 생성 없이 바로 접근 가능
        System.out.println(스태틱클래스.ccv);
        // 외부클래스$내부클래스.class로 컴파일 됨

    }
}

class 외부클래스 {
    int i = 100;
    내부클래스 내부 = new 내부클래스();
    final static int CONST = 100;
    private int outerIv = 0;
    private static int outerCv = 0;

    // 어렵게 생각하지 말고 iv, cv, lv 사용하는 것처럼 사용한다고 이해하자

    class 내부클래스 {
        /*
            객체생성 없이도 외부 클래스의 멤버에 접근 가능
            외부클래스에만 사용할 건데 굳이 밖에 둘 필요 없다.(캡슐화)
        */
        int iiv = outerIv; // 외부 클래스의 private멤버도 접근가능하다.
        int iiv2 = outerCv;
        
        void method() {
            System.out.println(i); // 객체 생성 없이 외부 클래스의 멤버 접근가능
        }
    }

    static class 스태틱내부클래스 {
        static int cv = 200;    // static 클래스만 static멤버를 정의할 수 있다. / final static이 붙는 상수는 제외
        int ccv = outerCv;
    }

    void myMethod() {
        // 상수는 Constant pool이 존재, 상수를 따로 저장해서 관리하고 있음. myMethod()가 종료되도 상수는 살아 있음
        int lv = 0; // 지역 변수 : 메서드 종료와 함께 소멸, JDK1.8부터 final 생략 가능, 값이 변경되지 않으면 상수로 간주
        final int LV = 0;   
        
//        lv = 3; 값을 변경하는 순간 지역변수가 되기 때문에 지역클래스 내부에서 에러가 난다.
        
        class 지역클래스 { // 내부클래스의 객체가 지역변수보다 더 오래 존재 가능, 지역 내부 클래스를 감싸고 있는 상수만 사용 가능
            final static int CONST = 300;
            
            int liv3 = lv; // JDK1.8부터 에러 아님, 1.8부터 final이 안붙어도 값이 안 바뀌면 상수취급하기 때문
            int liv4 = LV;  // 원래는 외부클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능
            
            void method() {
                
            }
        }
        System.out.println(지역클래스.CONST);
    }
}
