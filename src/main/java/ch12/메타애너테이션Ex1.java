package ch12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class 메타애너테이션Ex1 {
    public static void main(String[] args) {
        /*
            메타 애너테이션
                : '애너테이션을 위한 애너테이션'
                : java.lang.annotaion패키지에 포함

            @Target
                : 애너테이션을 정의할 때, 적용대상 지정에 사용

            @Retention
                : 애너테이션이 유지(retention)되는 기간을 지정하는데 사용
                    SOURCE  - 소스파일에만 존재. 클래스파일에는 존재하지 않음.
                    CLASS   - 클래스 파일에 존재. 실행시에 사용불가. 기본값
                    RUNTIME - 클래스 파일에 존재. 실행시에 사용가능.
                : 컴파일러에 의해 사용되는 애너테이션의 유지 정책은 SOURCE이다

            @Documented
                : javadoc으로 작성한 문서에 포함시킬 때 사용

            @Inherited
                : 애너테이션을 자손 클래스에 상속하고자 할 때 사용
                
            - Annotaion은 모든 애너테이션의 조상이지만 상속은 불가
            - Annotaion은 인터페이스
            
            마커 애너테이션 - Marker Annotaion
                : 요소가 하나도 정의되지 않은 애너테이션
                
            애너테이션 요소의 규칙
                - 요소의 타입은 기본형, String, enum, 애너테이션, Class만 허용됨
                - 추상메서드 괄호()안에 매개변수를 선언할 수 없다.
                - 예외를 선언할 수 없다.
                - 요소를 타입 매개변수로 정의할 수 없다.
        */
        
        Class<NewClass> cls = NewClass.class;   
        TestInfo anno = cls.getAnnotation(TestInfo.class); // NewClass의 TestInfo 애너테이션 가져 옴
        System.out.println("anno = " + anno.testedBy());
    }
}
/*
    - 애너테이션을 직접 만들어 쓸 수 있다.!
    - 애너테이션의 메서드는 추상 메서드이며, 애너테이션을 적용할 때 지정(순서X)
    - 적용시 값을 지정하지 않으면, 사용될 수 있는 기본값 지정 가능(null제외)
    - 요소가 하나이고 이름이 value일 때는 요소의 이름 생략가능
    - 요소의 타입이 배열인 경우, 괄호{}를 사용
*/

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 지정
@interface TestInfo {

    int defaultCount() default 1;

    int count();

    String testedBy();

    String[] testTools();

    TestType testType();

    DateTime testDate();    // 자신이 아닌 다른 애너테이션(@dateTime)을 포함할 수 있다.
}

enum TestType { FIRST, FINAL }
@interface DateTime {
    String yymmdd();
    String hhmmss();
}

// 정의한 애테이션 사용
@TestInfo(
        count=3, testedBy="Kim",
        testTools = {"JUnit", "AutoTester"},
        testType = TestType.FIRST,
        testDate=@DateTime(yymmdd="160101", hhmmss="225959")
)
class NewClass {
    
}