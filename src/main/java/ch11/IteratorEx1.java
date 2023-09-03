package ch11;

import java.util.*;

public class IteratorEx1 {
    public static void main(String[] args) {
        /*
            Iterator, ListIterator, Enumeration
                : 컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스
                : Enumeration은 Iterator의 구버전
                : ListIterator는 Iterator의 접근성을 향상시킨 것(단방향 -> 양방향) next() prev(), 잘 사용하진 않음

                컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 한 것
        */

        ArrayList list = new ArrayList();   // HashSet()으로 변경 시 HashSet은 get()이 없기때문에 for문에서 에러 남
                                            // Collection은 Iterator를 상속받은 인터페이스이기 때문에 Collection참조타입의 객체 어떤것이던 사용 가능
                                            // 참조변수를 Collection으로 두거나 구현 클래스의 값을 읽을 때 Iterator를 사용하는 편이 변경에 유리한 코드가 된다.
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        it = list.iterator();  // 1회용, 한 번 다 읽고나면 다시 얻어와야 함

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }


        Collection c = new TreeSet(list);
        c = new HashSet(list);

        it = c.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        /*
            Map에는 iterator()가 없음. keySet(), entrySet(), values()를 호출해야 함
        */
        Map map = new HashMap();
        map.put("1", "1");

        it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
