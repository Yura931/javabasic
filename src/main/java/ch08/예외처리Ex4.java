package ch08;

public class 예외처리Ex4 {
    public static void main(String[] args) {
        /*
            사용자 정의 예외
                : 우리가 직접 예외 클래스를 정의할 수 있다.
                : 조상은 Exception과 RuntimeException중에서 선택

            예외 되던지기(exception re-throwing)
                : 예외를 처리한 후에 다시 예외를 발생시키는 것
                : 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것
                : 분담 처리
        */
        
        // 사용자 정의 예외
        try {
            throw new MyException("사용자 정의 예외");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // 예외 되던지기
        try {
            method1();  // method1이 다시 던진 예외를 받아서 예외처리
        } catch (Exception e) {
            System.out.println("main메서드에서 예외가 처리되었습니다.");
        }

    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;        // 다시 예외를 바생시킨다 -> 호출한 곳으로 예외를 다시 떠넘김
        }
    }
}

class MyException extends Exception {
    MyException(String msg) {
        super(msg); // 조상인 Exception클래스의 생성자를 호출
    }
}
