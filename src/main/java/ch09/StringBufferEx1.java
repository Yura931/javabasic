package ch09;

public class StringBufferEx1 {
    public static void main(String[] args) {
        /*
            StringBuffer
                : String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
                : String과 달리 내용을 변경할 수 있다.(mutable 가변)
                : StringBuffer는 저장할 문자열의 길이를 고려해서 적절한 크기로 생성해야 함 / 배열은 길이 변경불가, 공간이 부족하면 새로운 배열 생성해야 함
                : append()는 지정된 내용을 StringBuffer에 추가 후, StringBuffer의 참조를 반환
        */

        StringBuffer sb = new StringBuffer("abc"); // 내부적으로 16의 길이를 가지고 있음, 생성 시 다루려는 문자열을 예측해서 만들어두는 걸 추천
        sb.append("123")
                .append("456");
        System.out.println("sb = " + sb);

        sb.insert(0, 3);
        System.out.println("sb = " + sb);

        StringBuffer sb2 = sb.append("zz");
        System.out.println("sb = " + sb);
        System.out.println("sb2 = " + sb2);

        /*
            StriugBuffer는 equals()가 오버라이딩 되어있지 않음(주소비교)
            StringBuffer를 String으로 변환 후에 equals로 비교해야 한다.
        */

        StringBuffer sb3 = new StringBuffer("abc");
        StringBuffer sb4 = new StringBuffer("abc");
        System.out.println("sb3 == sb4 = " + (sb3 == sb4));
        System.out.println("sb3.equals(sb4) = " + sb3.equals(sb4));
        System.out.println("sb3.capacity() = " + sb3.capacity());   // 인스턴스의 버퍼크기(char[])
        System.out.println("sb3.length() = " + sb3.length());       // 버퍼에 담긴 문자열의 길이
        
        String s3 = sb3.toString();
        String s4 = sb4.toString();
        System.out.println("s3.equals(s4) = " + s3.equals(s4));

        StringBuffer rev = new StringBuffer("123456");
        System.out.println("rev.reverse() = " + rev.reverse());





    }
}
