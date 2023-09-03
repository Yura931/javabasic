package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class 객체정렬Ex1 {
    /*
        Comparator, Comparable
            : 객체 정렬에 필요한 메서드(정렬기준 제공)를 정의한 인터페이스

        Comparable : 기본 정렬기준을 구현하는데 사용
        Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할 때 사용

        정렬 : 두 대상을 비교 자리 바꿈 반복
        정렬 기준 제공!
    */

    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬, 정렬기준을 정해주지 않을 경우 객체 배열에 저장된 객체가 구현한 Comparable에 의해 정렬 됨
        System.out.println("strArr = " + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));
        
    }

}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;   // -1을 곱해서 기본 정렬방식의 역으로 변경, 또는 return c2.compareTo(c1); 를 해줘도 된다.
        }
        return -1;
    }
}
