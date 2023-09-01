package ch09;

public class StringClassEx2 {
    public static void main(String[] args) {
        /*
            String클래스의 생성자와 메서드
        */

        String s = new String("Hello");

        char[] c = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(c);
        char[] c2 = s2.toCharArray();

        StringBuffer sb = new StringBuffer().append("Hello");
        String s3 = new String(sb.toString());

        String s4 = "Hello";
        String n = "0123456";
        char c3 = s4.charAt(1);
        char c4 = n.charAt(1);

        int i = "aaa".compareTo("aaa");
        int i2 = "aaa".compareTo("bbb");

        "aaa".indexOf(1, 2); // 두번째 매개변수 시작위치 지정,

        // Regular Expression
        String[] splitArr = "aaa,bbb,ccc".split(",");
        String[] splitArr2 = "aaa,bbb,ccc".split(",", 2); // 지정된 수로 자름
        
        // 기본형을 스트링으로, 빈문자열과 합쳐서 String으로 만드는 것보다 valueOf가 성능은 더 빠름
        String.valueOf(true);
        String dateStr = String.valueOf(new java.util.Date()); // 참조변수의 경우 toString()을 호출
        System.out.println("dateStr = " + dateStr);

        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr); // 배열의 문자열을 '-'로 구분해서 결합
        System.out.println("str = " + str);

        int ii = 100;
        String str1 = ii + "";
        String str2 = String.valueOf(ii);   // 성능은 valueOf가 더 좋지만 성능을 크게 신경쓰지 않아도 되는 경우 빈문자열을 합쳐서 만들어도 무방, 때에 따라서 융통성있게 사용하자

        int ii2 = Integer.parseInt("100");  // old한 방법, 편리한 것 사용하면 됨
        int ii3 = Integer.valueOf("100");   // parse문법 사용시 타입별로 다른 메서드를 사용해야해서 valueOf로 통일, Integer라는 래퍼클래스 반환, 기본형으로 받아도 되고 래퍼클래스로 받아도 되고, 오토박싱
        Integer ii4 = Integer.valueOf("100");
    }

    boolean contains(CharSequence s) {

        /*
            CharSequence를 구현하게 한 클래스
            CharBuffer, Segment, String, StringBuffer, StringBuilder
        */

        return false;
    }
}
