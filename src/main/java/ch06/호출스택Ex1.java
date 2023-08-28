package ch06;

public class 호출스택Ex1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        /*
            스택(stack) : 밑이 막힌 상자. 위에 차곡차곡 쌓인다.

            호출 스택(call stack)
                        : 메서드 수행에 필요한 메모리가 제동되는 공간
                        : 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제

            main 실행 -> println 호출 -> main 대기 -> println 실행 -> println 종료 -> println 스택에서 사라짐 -> main으로 돌아와 다시 실행상태

            아래 있는 메서드가 위의 메서드를 호출한 것
            맨 위의 메서드 하나만 실행중, 나머지는 대기중

            단계별로 호출 스택이 어떻게 변하는지 그림 그려보자
        */
    }
}
