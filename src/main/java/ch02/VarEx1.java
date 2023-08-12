package ch02;

public class VarEx1 {
    public static void main(String[] args) {
        /*
            변수 : 하나의 값을 저장할 수 있는 메모리 공간(RAM)
            전체 메모리 저장 공간을 1byte
            각각 저장공간에 0,1,2,3,4... 연속된 숫자 - 메모리 주소
            공간에 이름을 붙이고 읽을 수 있도록 한 것이 변수

            변수의 선언
                : 값(data)을 저장할 공간을 마련하기 위해서
                : 변수타입 변수이름;

            변수에 값 저장하기
                : int age; age라는 이름의 저장공간이 생김, 정수 타입 변수 선언
                : age = 25; 변수 age에 25를 저장

            변수의 초기화 - 변수에 처음으로 값을 저장하는 것

            클래스 변수, 인스턴스 변수, 지역 변수
            지역 변수 - 값을 읽기 전에 꼭 초기화 해야 함

            8개의 기본형 타입
            값 - 문자 : 가나다, ABC 등등 - char
                숫자 : 정수 0, 25 ~ 100 - byte, short, int, long
                    : 실수 3.14 ~ 0.1 - float, double
               논리 : boolean(true, false)

           변수(variable) - 하나의 값을 저장하기 위한 공간
           상수(constant) - 한 번만 값을 저장 가능한 변수 , final 키워드 사용
           리터럴(literal) - 그 자체로 값을 의미하는 것

           리터럴의 접두사와 접미사
           정수형, 실수형의 경우 타입이 여러개 이기때문에 접미사를 사용해 구분
           long - 100L
           float - 1.4f

           10. -> 10.0d
           .10 -> 0.10d
           10f -> 10.0f
           1e3 -> 1000.0d e는 10의 n제곱 의미 10의 3제곱

           접두사를 붙여서 표현 가능
           // Ob0101; 2진수
           // 100; 10진수
           // 0100; 8진수
           // 0x100; 16진수

           범위가 변수 > 리터럴 인경우 OK
           int i = 'A'(문자코드인 65가 저장 됨); // int > char
           long i = 123;    // long > int
           double d = 3.14f // double > float

           범위가 변수 < 리터럴 인경우 에러
           int i = 30_0000_0000; // int의 범위(+-20억) 벗어남
           long i = 3.14f; // long < float
           float f = 3.14; // float < double

           byte, short 변수에 int리터럴 저장가능
           byte b = 100; // OK byte의 범위(-128~127)에속함
           byte b = 128; // 에러. byte의 범위를 벗어남
           
           문자와 문자열
           char ch= 'A';
           char ch = 'AB'; // 에러
           String s = "ABC"; // 문자열, 문자열 리터럴
           
           String은 원래 java에서 제공하는 클래스
           자주 사용하는 타입으로 new 연산자를 사용하지 않고 값을 할당하는 방식을 허용함
           String s1 = "AB";
           String s2 = new String("AB");
           
           String s1 = "A" + "B"; // "AB" 문자열 결합
           "" + 7 -> "" + "7" -> "7" // 숫자 -> 문자열
           문자열은 문자열하고만 결합이 가능 숫자는 문자열로 변경되어 결합 됨
           문자열 결합은 왼쪽에서 부터 결합이 시작 됨
           "" + 7 + 7 -> "7" + 7 -> "7" + "7" -> "77"
           7 + 7 + "" -> 14 + "" -> "14" + "" -> "14"
           문자열 + any type -> 문자열


           기본형(Primitive type)
           - 오직 8개 (boolean, char, byte, short, int, long, float, double)
           - 실제 값을 저장
           참조형(Reference type)
           - 기본형을 제외한 나머지 (String, System 등)
           - 메모리 주소를 저장(4 byte(40억 byte = 4GB > 2GB) 또는 8 byte(64bit JVM) 40억 * 40억 = 160경(1600만TB))
           - 객체의 주소를 저장
        */

        int x = 4, y = 2;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int age = 25;
        char ch = '가';
        double pi = 3.14;

        final int MAX = 100;



    }
}
