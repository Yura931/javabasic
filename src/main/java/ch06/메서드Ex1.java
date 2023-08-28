package ch06;

public class 메서드Ex1 {
    public static void main(String[] args) {
        /*
            메서드란 : 문장들을 묶어놓은 것
                    : 명령문 집합
                    : 항상 클래스 안에 들어가 있어야 함
                    : 작업에 필요한 값을 받아 처리 후 결과 반환
            프로그래밍에서 코드의 중복을 상당히 나쁘게 봄! 반드시 제거해야 함
            
            함수 : 클래스에 독립적, 약간의 차이점 제외 근본적으로 메서드와 함수는 같은 것
            
            장점
                - 코드의 중복을 줄일 수 있다.
                - 코드의 관리가 쉽다.
                - 코드를 재사용할 수 있다.
                - 코드가 간결해서 이해하기 쉬워진다.
                
            작성
                - 반복적으로 수행되는 여러 문장을 메서드로 작성
                - 하나의 메서드는 한 가지 기능만 수행하도록 작성
                
                유지보수 유리, 최소의 의미있는 작업단위로 나눠놔야 재사용성이 높아 짐
        */
        
        // 메서드의 호출
        CtmMath cm = new CtmMath();
        cm.print99danAll();
        int result1 = cm.add(3, 5); // add메서드 호출, 메서드가 작업을 마치면 호출한 곳으로 돌아옴
        long result2 = cm.multiply(3L, 5L);
        double result4 = cm.divide(5L, 3L);

        long result5 = cm.max(10L, 3L);
        long min = cm.min(10, 3);

        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);
        System.out.println("min = " + min);

        cm.printGugudan(6);
    }
}

class CtmMath {

    // 반환타입이 있는 경우 return 필수!
    // 타입이 일치해야 함(자동 형변환)
    int add(int a, int b) { // 매개변수 : 메서드 안에 있는 지역변수
        int result = a + b;
        return result;
    }

    long multiply(long x, long y) {
        return x * y;
    }

    double divide(long x, long y) {
        return x / y;
    }

    long max(long a, long b) {
        return a > b ? a : b;
    }

    long min(long a, long b) {
        return a > b ? b : a;
    }

    void print99danAll() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
        }
        System.out.println();
    }

    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return; // 입력받은 단(dan)이 2 ~ 9가 아니면, 메서드 종료하고 돌아가기
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
    }
}
