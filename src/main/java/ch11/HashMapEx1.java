package ch11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapEx1 {
    public static void main(String[] args) {
        /*
            HashMap과 Hashtable - 순서X, 중복(키X, 값O)
                : Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
                : HashMap(동기화X)은 Hashtable(동기화O)의 신버젼

            TreeMap
                : 범위 검색과 정렬에 유리한 컬렉션 클래스
                : HashMap보다 데이터 추가, 삭제에 시간이 더 걸림

            HashMap
                : Map인터페이스를 구현한 대표적인 컬렉션 클래스
                : 순서를 유지하려면, LinkedHashMap클래스를 사용하면 됨
                : 해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠르다.
                : 데이터를 키와 값의 쌍으로 저장
                : Entry[], key - value 한쌍 묶음 저장

            해싱(hashing)
                - 해쉬함수, 함수이용, 저장 & 읽어오기
                - 해시함수(hash function)로 해시테이블(hash table)에 데이터를 저장, 검색, 저장위치 = 해시코드(배열 index)
                - 해시테이블은 배열과 링크드 리스트가 조합된 형태

        */

        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id :");
            String id = s.nextLine().trim();

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if (!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
