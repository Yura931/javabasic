package ch03;

public class OperatorEx4 {
    public static void main(String[] args) {
        /*
            비교 연산자
                : 두 피연산자를 비교해서 true 또는 false를 반환

            'A' > 'B' -> 65 > 66
            char  char   int  int

            문자열의 비교에는 == 대신 equals()를 사용해야 함

            논리 연산자 && ||
            &&가 ||보다 우선순위가 높음
        */
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }
}
