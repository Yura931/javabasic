package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassEx1 {
    public static void main(String[] args) {
        /*
            Collections - 컬렉션을 위한 메서드(static)를 제공
                Objects(객체)
                Arrays(배열)
                Collections(컬렉션)

            - 컬렉션 채우기, 복사, 정렬, 검색
            - 컬렉션의 동기화 - synchronizedXXX()
            - 변경불가(readOnly) 컬렉션 만들기 - unmodifiableXXX() 수정 불가
            - 싱글톤 컬렉션 만들기 - singletonXXX() 객체 한개만 저장
            - 한 종류의 객체만 저장하는 컬렉션 만들기 - checkedXXX()
        */

        List syncList = Collections.synchronizedList(new ArrayList());  // 동기화 되지 않은 List를 넣으면 동기화 된 List를 얻을 수 있음

    }
}
