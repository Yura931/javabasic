package ch11;

import java.util.*;

public class HashSetEx1 {
    public static void main(String[] args) {

        /*
            HashSet - 순서X, 중복X
                : Set인터페이스를 구현한 대표적인 컬렉션 클래스
                : 순서를 유지하려면, LinkedHashSet클래스를 사용하면 된다.

            TreeSet
                : 범위 검색과 정렬에 유리한 컬렉션 클래스
                : HashSet보다 데이터 추가, 삭제에 시간이 더 걸림
        */

        Set hashSet = new HashSet(10, 0.8f); // 2번째 매개변수, 용량이 80퍼센트가 차면 2배로 늘리겠다는 의미
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++) {
            System.out.println(set.add(objArr[i])); // add() 유무에 대한 true, false 출력
        }

        System.out.println("set = " + set);

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        System.out.println("set = " + set);
        // set은 정렬 불가, 정렬하고 싶은 경우 set을 List로 새로 생성 후 sort
        List list = new LinkedList(set);
        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
