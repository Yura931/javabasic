package ch07;

import java.util.Date;
import static java.lang.Math.*;

public class 패키지Ex1 {
    public static void main(String[] args) {
        /*
            package
                : 서로 관련된 클래스의 묶음
                : 클래스는 클래스 파일(*.class) 패키지는 폴더. 하위 패키지는 하위 포더
                : 클래스의 실제 이름(full name)은 패키지를 포함.(java.lang.String)
                    rt.jar는 클래스들을 압축한 파일(JDK설치경로\jre\lib에 위치)

            패키지의 선언
                : 패키지는 소스파일의 첫 번째 문장으로 단 한번 선언
                : 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다.
                : 패키지 선언이 없으면 이름없는(unnamed) 패키지에 속하게 된다.

            package명을 전부 입력해서 실행해 주어야 함

            클래스 패스(classpath)
                : 클래스 파일(*.class)의 위치를 알려주는 경로(path)
                : 환경변수(OS 레벨에서 관리) classpath로 관리하며, 경로간의 구분자는 ';'를 사용
                    classpath(환경변수)에 패키지의 루트를 등록해줘야 함. / 경로를 통해 찾지 못하면 이 클래스패스를 통해 클래스 파일을 찾음
                    명령창에서 패키지 루트로 이동하지 않아도 classpath를 통해 찾게 됨
        */

        System.out.println("Hello World!");


        /*
            import문
                : 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
                : 컴파일러에게 클래스가 속한 패키지를 알려준다.
                : java.lang 패키지(기본 패키지)의 클래스는 import하지 않고도 사용할 수 있다.
                    String, Object, System, Thread ...
                    import java.lang.*;

                : import문을 선언하는 방법
                    import 패키지명.클래스명;
                    or
                    import 패키지명.*; -> 모든 클래스
                : import문은 패키지문과 클래스선언의 사이에 선언한다.
                : import문은 컴파일 시에 처리되므로 프로그램의 성능에 영향없음.
                : 다음의 두 코드는 서로 의미가 다르다
                    import java.util.*;                     import java.*; -> java 패키지의 모든클래스(패키지는 포함안됨)
                    import java.text.*;
                : 이름이 같은 클래스가 속한 두 패키지를 import할 때는 클래스 앞에 패키지명을 붙여줘야 한다.

            static import문 / 꼭 필요할 때만 사용하자
                : static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
                    import static java.lang.Integer.*;   -> Integer클래스의 모든 static메서드
                    import static java.lang.Math.random; -> Math.random()이 아닌 random()으로 사용 가능
                    import static java.lang.System.out;  -> System.out을 out만으로 참조가능
        */
        java.util.Date today = new java.util.Date();
        Date date = new Date();
        System.out.println(random());
    }
}
