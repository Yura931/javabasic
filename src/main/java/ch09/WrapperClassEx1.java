package ch09;

import java.util.ArrayList;

public class WrapperClassEx1 {
    public static void main(String[] args) {
        /*
            래퍼(wrapper) 클래스
                : 8개의 기본형을 객체로 다뤄야할 때 사용하는 클래스
                
            
            객체지향언어 : 모든 것이 객체
                        : 기본형을 둔 이유 - 성능 때문!
                        : 기본형은 값을 바로 읽을 수 있고, 참조형은 참조주소를 읽고 값을 읽어야하는 단계가 생김
    
        */

        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println("(i==i2) = " + (i==i2));
        System.out.println("i.equals(i2) = " + i.equals(i2));
        System.out.println("i.compareTo(i2) = " + i.compareTo(i2)); // 같으면 0, 오른쪽값이 작으면 양수, 오른쪽값이 크면 음수
        System.out.println("i.toString() = " + i.toString());

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.SIZE = " + Integer.SIZE + "bits");
        System.out.println("Integer.BYTES = " + Integer.BYTES + "bytes");
        System.out.println("Integer.TYPE = " + Integer.TYPE);

        /*
            Number클래스
                : 모든 숫자 래퍼 클래스의 조상
                : 객체 값을 기본형으로 바꿔주는 메서드를 가지고 있음
        */
        
        int it = new Integer("100").intValue(); // Integer타입의 값을 기본형인 int로 변경해주는 메서드, Number클래스의 intValue() 메서드 재정의되어 있는 것
        
        
        int intVal = 100;
        System.out.println("Integer.parseInt(\"100\", 10) = " + Integer.parseInt("100", 10));
        System.out.println("Integer.parseInt(\"100\", 2) = " + Integer.parseInt("100", 2));
        System.out.println("Integer.parseInt(\"100\", 8) = " + Integer.parseInt("100", 8));
        System.out.println("Integer.parseInt(\"100\", 16) = " + Integer.parseInt("100", 16));
        System.out.println("Integer.parseInt(\"FF\", 16) = " + Integer.parseInt("FF", 16));

        /*
            오토박싱 & 언박싱
            int -> Integer : 오토박싱
            Integer -> int : 언박싱

            : JDK 1.5 이전에는 기본형과 참조형간의 연산이 불가능
            : 기본형의 값을 객체로 자동변환하는 것을 오토박싱, 그 반대는 언박싱

            기본형과 참조형 연산 시 컴파일러가 코드를 자동으로 변경해줌
            Integer iObj = new Integer(7);
            int i = 5 + iObj.intValue(); -> 5 + iObj를 5 + iObj.intValue();로 변경해주는 것
            
            
        */

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(10));
        list.add(10);            // 오토박싱 10 -> new Integer(10), JDK1.5 이전에는 에러
        
        int value1 = list.get(0).intValue();
        int value = list.get(0); // (오토)언박싱 new Integer(10) -> 10

        // 기본형을 참조형으로 형변환 가능!(형변환 생략가능), 원래 안되던 것들.. 기본형과 참조형간의 자동변환
        int ii = 10;
        Integer intg = (Integer) ii;
        Object obj = (Object) ii;
    }
}
