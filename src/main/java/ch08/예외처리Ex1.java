package ch08;

public class 예외처리Ex1 {
    public static void main(String[] args) {

        /*
            프로그램 오류
                : 컴파일 에러(compile-time error) - 컴파일 할 때 발생하는 에러
                : 런타임 에러(runtime error) - 실행 할 때 발생하는 에러
                    에러(error)       - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 out of memory(oome)
                    예외(exception)   - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
                : 논리적 에러(logical error) - 작성 의도와 다르게 동작

                javac.exe : 자바컴파일러 - 구문체크, 번역, 최적화(똑똑해짐!)


                예외처리의 정의와 목적
                    정의 - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
                    목적 - 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것

                Exception : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외(입출력, 클래스 존재 유무...), 체크드 예외(필수)
                RuntimeException : 프로그래머의 실수로 발생하는 예외(산술계산, 형변환, null, 배열 범위), 언체크드예외(선택)
                
                에외가 발생하면, 이를 처리할 catch블럭을 찾아 내려감
                일치하는 catch블럭이 없으면, 예외는 처리 안됨
                Exception이 선언된 catch블럭은 모든 예외 처리(마지막 catch블럭)

                printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력
                getMessage()      : 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.

                예외를 처리하는 방법 : try-catch문, 예외 선언하기(예외 떠넘기기, 알리기), 은폐(조용히 덮기..)

                finally 블럭
                    : 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다.


        */
//        system.out.println(); 컴파일 에러
        
        try {
            System.out.println(args[0]); // 런타임 에러
            System.out.println(4); // 예외가 발생 한 후의 문장은 실행되지 않음
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        } finally {
            System.out.println("1 finally");
        }
        
        try {
            System.out.println(0/0);
        }  catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
            ae.printStackTrace();
            System.out.println("ae.getMessage() = " + ae.getMessage());
        } finally {
            System.out.println("2 finally");
        }

        /*
            멀티 catch블럭
                내용이 같은 catch블럭을 하나로 합친 것(JDK1.7부터)
                예외가 부모 자식관계일경우는 x
         */

        try {
            Exception e = new Exception("고의로 발생시켰음");
            throw e;
        } catch (ExceptionA | ExceptionB a) {
            // 두 예외가 가지고 있는 공통 속성만 사용 가능
        } catch (Exception e) {
            System.out.println("에러 메시지 : " + e.getMessage()); // try블럭에서 잡은 에외를 catch블럭에서 처리
            e.printStackTrace();
        }

        System.out.println("프로그램이 정상 종료되었음.");  // 정상 종료


        /*
            checked예외(Exception과 자손)
                : 컴파일러가 예외 처리 여부를 체크(예외 처리 필수)
            unchecked예외(RuntimeException과 자손)
                : 컴파일러가 예외 처리 여부를 체크 안함(예외 처리 선택)
        */

//        throw new Exception(); Exception 고의 발생 예외처리 필수! 컴파일도 안 됨 ..
        throw new RuntimeException();   // RuntimeException 고의 발생, 예외처리 선택 try-catch없이도 컴파일은 됨, 실행 시키면 발생 ~ 비정상 종료!
    }

}

class ExceptionA extends RuntimeException {
    public void method() {}
}

class ExceptionB extends ArithmeticException {
    public void method() {}
}


