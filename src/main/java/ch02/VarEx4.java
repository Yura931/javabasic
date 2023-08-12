package ch02;

public class VarEx4 {
    public static void main(String[] args) {
        /*
            타입간의 변환방법
            1. 문자와 숫자간의 변환
                문자 '0'을 빼거나 더하거나
            2. 문자열로의 변환
                3 -> +"' -> "3"
                '3' -> +"" -> "3"
            3. 문자열을 숫자로 변환
                "3" -> Integer.parseInt("3") -> 3
                "3.4" -> Double.parseDouble("3.4") -> 3.4
            4. 문자열을 문자로 변환
                "3" -> charAt(0) -> '3'
        */

        String str = "3";
        System.out.println(str.charAt(0) - '0'); // "3" -> '3'
        System.out.println('3' - '0' + 1); // '3' -> 3
        System.out.println(Integer.parseInt("3") + 1);
        System.out.println("3" + 1);
        System.out.println(3 + '0'); // '0'은 숫자로 48, char타입으로 형변환해서 출력해야 문자 '3'이 나옴
    }
}
