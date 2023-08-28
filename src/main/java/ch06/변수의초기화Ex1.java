package ch06;

import com.sun.org.apache.xml.internal.security.Init;

class Engine {}
public class 변수의초기화Ex1 {
    int x;          // 인스턴스 변수 자동으로 0으로 초기화
    int y = x;
    
    /*
        1. 명시적 초기화(=) : 간단한 초기화
        2. 초기화 블럭 : 복잡한 초기화 iv : {}, cv : static {}
        3. 생성자 
    */
    int door = 4;   // 기본형(primitive type) 변수의 초기화
    Engine e = new Engine();  // 참조형(reference type) 변수의 초기화 / 참조형 변수 - null 기본값, 객체주소
    
    
    public static void main(String[] args) {
        /*
            지역번수는 수동 초기화 해야함(사용전 꼭!!)
            멤버변수는 자동 초기화된다.
            
            클래스 변수 초기화 시점 : 클래스가 처음 로딩될 때 단 한번(메모리에 올라갈 때)
            인스턴스 변수 초기화 시점 : 인스턴스가 생성될 때 마다
        */
        
        int i;
        // int j = i; 에러. 지역변수를 초기화하지 않고 사용
        // 호출스택 - 재사용 빈번한 메모리 (짧은시간동안 같은 메모리 공간을 다른 메서드가 썼다가 삭제했다가)
        // 여러 메서드가 같은 공간을 쓰고 또쓰고
        // 쌓였다가 없어졌다가
        // 호출될때마다 메모리공간을 0으로 초기화하면 성능이 떨어짐
        // 지역변수는 메소드가 호출되었을 때만 사용되어서 생명주기가 짧음
        // 다른 메소드가 쓰던 자리를 매번 다른 값으로 덮어쓰기 하는 것
        // 그렇기 때문에 초기화를 필수로 해주어야 한다.
        
    }

    static int[] arr = new int[10]; // 명시적 초기화 - 간단 초기화
    
    static { // 클래스 초기화 블럭 - 배열 arr를 난수로 채운다. - 복잡 초기화
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
    
    InitTest it = new InitTest();
    // 초기화 순서
    // cv 초기화 된 후 -> iv 초기화 됨
    // 자동 -> 간단 -> 복잡
}

class InitTest {
    
    // 간단 초기화
    static int cv = 1; // 명시적 초기화
    int iv = 1;         // 명시적 초기화
    
    // 복잡 초기화
    static {            // 클래스 초기화 블럭
        cv = 2;
    }

    {                   // 인스턴스 초기화 블럭
        iv = 2;
    }
    
    InitTest() {        // 생성자
        iv = 3;
    }
}