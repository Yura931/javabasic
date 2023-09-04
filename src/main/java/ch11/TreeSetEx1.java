package ch11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        /*
            TreeSet - 범위 탐색, 정렬
                : 이진 탐색 트리(binary search tree)로 구현. 범위 탐색과 정렬에 유리
                : 이진 트리는 모든 노드가 최대 2개의 하위 노드를 갖음
                    각 요소(node)가 나무(tree)형태로 연결(LinkedList의 변경)
                    노드 하나 TreeNode
                    left, el, right
                    
            이진 탐색 트리(binary search tree)
                : 부모보다 작은 값은 왼쪽 큰 값은 오른쪽에 저장
                : 데이터가 많아질 수록 추가, 삭제에 시간이 더 걸림(비교 횟수 증가)
                
            HashSet은 equals(), hashCode()로 비교
            TreeSet은 compare()를 호출해서 비교

            루트부터 트리를 따라 내려가며 값을 비교. 작으면 왼쪽, 크면 오른쪽에 저장
        */

        Set set = new TreeSet(new TestComp()); // treeSet은 비교기준이 필요, 저장하는 객체가 Comparable을 가지고 있거나 TreeSet 생성자에 비교기준을 넣어주거나 해야 한다.
                                 // Integer, String 등의 클래스는 이미 Comparable을 구현하고 있음
                                 // 사용자 지정 클래스의 경우 정렬 기준을 잘 만들어 주어야함

        for (int i = 0; set.size() < 6; i++) {
            set.add(new Test());
        }

        System.out.println("set = " + set);


        /*
            트리 순회(tree traversal)
                : 이진 트리의 모든 노드를 한번 씩 읽는 것을 트리 순회라고 한다.
                : 전위 순회(pre order), 후위 순회(post order), 중위 순회(in order), 레벨 순회
                : 중위 순회하면 오름차순으로 정렬된다.
        */
    }
}

class Test {}

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}
