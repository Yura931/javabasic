package ch06;

public class 오버로딩Ex1 {
    public static void main(String[] args) {
        /*
            한 클래스 안에 같은 이름의 메서드 여러 개 정의하는 것

            오버로딩이 성립하기 위한 조건
            1. 메서드 이름이 같아야 한다.
            2. 매개변수의 개수 또는 타입이 달라야 한다.
            3. 반환 타입은 영향없다.

            오버로딩의 올바른 예 - 매개변수는 다르지만 같은 의미의 기능수행

            메서드 오버로딩
            연산자 오버로딩

            + 연산자 : 4가지 기능
                - 부호
                - 덧셈
                - 문자열
                - 결합
        */

        System.out.println();
    }

    // 이 두 메소드의 경우 매개변수 순서가 int, long / long, int 순으로 오버로딩 에러는 없지만
    // 메서드 호출 시 add(1, 2) 이렇게 호출하면 컴파일러가 둘 중 어떤것을 사용해야하는지 알 수 없어 에러가 남(ambiguous 모호하다)
    // 에러가 나지 않도록 하려면 add(1, 2L) / add(1L, 2) 이런식으로 매개변수의 타입을 명확하게 해 주어야 한다. 혹은 int add(int a, int b) {} 명확하게 알 수 있는 메서드를 만들어 주어야 함
    long add(int a, long b) {
        return a + b;
    }

    long add(long a, int b) {
        return a + b;
    }

    int add(int[] a) {
        System.out.println("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }

        return result;
    }

}
