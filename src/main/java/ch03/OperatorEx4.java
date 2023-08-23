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

            조건 연산자
            삼항연산자
            조건식 ? 식1 : 식2

            대입 연산자
                : 오른쪽 피연산자를 왼쪽 피연산자에 저장 후 저장된 값을 반환
            모든 연산자는 결과값을 반환
            lvalue(저장공간) - 대입 연산자의 왼쪽 피연산자
            rvalue - 대입 연산자의 오른쪽 피연산자
        */
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String result = (str1 == str2) ? str1 : str2;
        System.out.println("result = " + result);
    }
}
