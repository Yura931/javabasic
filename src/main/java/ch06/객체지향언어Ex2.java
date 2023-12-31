package ch06;

import javax.xml.ws.spi.http.HttpContext;
import java.util.Set;

public class 객체지향언어Ex2 {
    public static void main(String[] args) {
        객체지향언어Ex1 ex1 = new 객체지향언어Ex1();
        객체지향언어Ex1 ex2 = new 객체지향언어Ex1();
        // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장, new 연산자 :객체주소가 어디인지 알려줌
        // 클래스의 설계도 대로 객체가 만들어 지는 것
        // 정의된 대로!


        ex1.멤버변수 = 100; // 멤버변수의 값 할당
        String 결과출력 = ex1.왜나왔나(); // 메서드 호출
        System.out.println("결과출력 = " + 결과출력);

        ex2 = ex1; // ex1의 값이 ex2에 들어 감, ex2의 참조주소가 ex1의 주소와 연결 됨,
        // 기존에 ex2 객체가 생성되며 만들어진 메모리는 더이상 사용할 수 없고 GC(가비지 컬렉터)가 주기적으로 메모리를 확인하며 사용할 수 없는 객체들을 찾으면 제거, 불필요하게 메모리가 낭비되는 일이 없도록 함
        // GC 덕분에 필요할 때 만들어 사용하기만 하면 되고 제거하는 작업은 하지 않아도 됨
        System.out.println("ex2 = " + ex2.왜나왔나());

    }
}
