package ch08;

public class 예외처리Ex2 {
    public static void main(String[] args) throws Exception { // JVM이 받아서 마지막으로 처리, JVM 기본 예외처리기 출력
        /*
            예외 선언!
                : 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
            method1() 호출 -> method2() 호출 -> Exception 발생 -> 호출한곳으로 넘김 -> method1이 예외 건내받음 ->
                        method1도 예외를 호출한 곳으로 넘김 -> main이 넘겨받음 -> main도 떠넘김.. -> JVM이 받아서 마지막을 처리 -> 비정상 실행


            발생한 곳에서 직접 try-catch로 처리할 것인지, 떠넘길 것인지(알린다.)
        */
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
