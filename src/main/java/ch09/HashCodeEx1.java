package ch09;

public class HashCodeEx1 {
    public static void main(String[] args) {
        /*
            hashCode()
                : 객체의 해시코드(hash code, 정수 값)를 반환하는 메서드
                : Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
                : 객체의 지문이라고도 함
                    public native int hashCode(); -> 네이티브 메서드 : OS의 메서드를 가져와 사용하는 것, C언어로 만들어져 있어서 내용을 볼 순 없음
                : equals()를 오버라이딩하면, hashCode()도 오버라이딩해야 한다.
                    원래 주소를 가지고 작업 -> iv를 가지고 작업하도록 오버라이드, hashCode()도 iv를 가지고 작업하도록 오버라이드
                    equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문
                : System.indentityHashCode(Object obj)는 Object클래스의 hashCode()와 동일, 오버라이딩 하지 않은 이전의 기능이 필요할 때 사용
        */

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        // 오버라이딩 된 hashcode 객체의 주소가 아닌 iv값
        System.out.println("str1.hashCode() = " + str1.hashCode());
        System.out.println("str2.hashCode() = " + str2.hashCode());

        // 원래는 객체 주소를 이용해 만드는 값이기 때문에 객체마다 값이 다 다름
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));


        // 32bit JVM에서는 주소가 int 값
        // 64bit JVM에서는 주소가 8byte(long) -> 이 값을 가지고 hashcode를 만들면 겹치는 값이 생길 수 있음
    }
}
