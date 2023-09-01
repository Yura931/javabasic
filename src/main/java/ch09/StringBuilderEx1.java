package ch09;

public class StringBuilderEx1 {
    public static void main(String[] args) {
        /*
            StringBuilder(StringBuffer와 거의 비슷)
                : 동기화 되어있지 않음
                : StringBuffer는 동기화 되어있다. 멀티 쓰레드에 안전(thread-safe)
                : 멀티쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하
                    이럴 땐 StringBuffer대신 StringBuilder를 사용하면 성능 향상

            싱글 쓰레드 : 한번에 1개 작업
            멀티 쓰레드 : 한번에 n개 작업, 요즘은 대부분 멀티쓰레드, 채팅, 파일다운로드 같은 기능 동시 진행
                        : 단점 - 한번에 여러작업을 하다보니 데이터를 공유, 내가 작업하는 데이터를 다른사람이 작업해서 데이터가 꼬이는 수가 있다....

        */

        StringBuilder sb = new StringBuilder("abc");
        sb.append("defg");
        System.out.println("sb = " + sb);
    }
}
