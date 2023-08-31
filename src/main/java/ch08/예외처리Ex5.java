package ch08;

public class 예외처리Ex5 {
    public static void main(String[] args) {
        /*
            연결된 예외(chained exception)
                : 한 예외가 다른 예외를 발생시킬 수 있다.
                : 예외 A가 예외 B를 발생시키면, A는 B의 원인 예외(cause exception)

            Throwable
                : Exception, Error의 조상

            Throwable initCause(Throwable cause) : 지정한 예외를 원인 예외로 등록
            Throwable getCause()

            하나의 예외 안에 또다른 예외를 포함시키는 것

            : 여러 예외를 하나로 묶어서 다루기 위해
        */

        try {
            install();
        } catch (InstallException e) {
            throw new RuntimeException(e);
        }

    }

    static void install() throws InstallException {
        try {
            startInstall(false, false);
            //copyFiles();
        } catch(Exception e) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(e);
            throw ie;
        }
    }

    static void startInstall(boolean space, boolean memory) throws SpaceException {
        if(!space) throw new SpaceException("설치할 공간이 부족합니다.");
        if(!memory) throw new RuntimeException(new MemoryException("메모리가 부족합니다.")); // 필수예외를 선택예외로 필요할 때만 사용하고 싶을 때 RuntimeException으로 감싸서 처리
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}
class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}