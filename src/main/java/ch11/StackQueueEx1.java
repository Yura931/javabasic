package ch11;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;

public class StackQueueEx1 {
    public static void main(String[] args) {
        /*
            스택(Stack) : LIFO(Last In First Out)구조. 마지막에 저장된 것을 제일 먼저 꺼내게 된다. 밑이 막힌 상자, 순차적 추가, 순차적 삭제 -> ArrayList 구현이 더 어울림
                12345 저장(push) -> 54321 추출(pop)

            큐(Queue) : FIFO(First In First Out)구조. 제일 먼저 저장한 것을 제일 먼저 꺼내게 된다. 양 끝이 뚫린 상자, 삭제시 자리 이동 없음 -> LinkedList가 좀 더 적합
                12345 저장(offer) -> 12345 추출(poll)
        */

        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue는 인터페이스

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while (!st.empty()) {
            System.out.println(st.pop());
        }

        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

        /*
            스택의 활용 예 - 수식계산, 수식괄호검사, 워드프로세서의 undo/redo, 웹브라우저의 뒤로/앞으로
            큐의 활용 예 - 최근사용문서, 인쇄작업 대기목록, 버퍼(buffer)
        */

        st = new Stack();
        String expression = "((3+5)*8-2)";

        try {

            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }

        } catch(EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다. catch");
        }

    }
}
