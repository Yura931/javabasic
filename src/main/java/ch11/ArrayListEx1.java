package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {

        /*
            ArrayList
                : ArrayList는 기존의 Vector를 개선한 것으로 구현원리와 기능적으로 동일
                : ArrayList와 달리 Vector는 자체적으로 동기화처리가 되어 있다.
                : List인터페이스를 구현하므로, 저장순서가 유지되고 중복을 허용함
                : 데이터의 저장공간으로 배열을 사용(배열기반)

                데이터 삭제시 이동 과정이 부담이 많은 과정
                되도록 일어나지 않도록 하는 것이 좋음
        */

        // 기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장 가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        // list1.add(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // subList는 읽기전용이기 때문에 새로운 ArrayList로 만들어주어야 사용 가능, ArrayList(Collection c) 생성자 이용해서 새 ArrayList 생성
        print(list1, list2);

        // Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");  // 3번 위치에 A 추가, 다른 요소들이 움직임
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        // indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        System.out.println("index=" + list1.indexOf(1)); // String "1", Integer 1 다름
        // list1.remove(1);     인덱스가 1인 객체를 삭제
        list1.remove(new Integer(1)); // 값이 1인 객체를 삭제, 지정한 인덱스의 객체를 삭제할 것인지, 매개변수로 넘긴 객체를 삭제할 것인지 정확하게 명시해 주어야 한다.
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(0))) {
                list2.remove(i);
            }
        }
        print(list1, list2);

        ArrayList removeArray = new ArrayList();
        removeArray.add(1);
        removeArray.add(2);
        removeArray.add(3);
        removeArray.add(4);
        removeArray.add(5);

        ArrayList removeArray2 = new ArrayList(removeArray);

        // ArrayList에 저장된 첫 번째 객체부터 삭제하는 경우(배열 복사 발생), 삭제했지만 남아있음, 성능상 좋지 않음
        for (int i = 0; i < removeArray.size(); i++) {
            removeArray.remove(i);
        }

        System.out.println("removeArray = " + removeArray);

        // ArrayList에 저장된 마지막 객체부터 삭제하는 경우(배열 복사 발생안함) 빠르고, 다 지워짐
        for (int i = removeArray2.size() - 1; i >= 0; i--) {
            removeArray2.remove(i);
        }

        System.out.println("removeArray2 = " + removeArray2);
    }

    public static void print(Collection list1, Collection list2) {
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
