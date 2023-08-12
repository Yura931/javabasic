package ch02;
import java.util.*;

public class ScanfEx1 {
    public static void main(String[] args) {
        /*
            Scanner - 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
            1. import문 추가
                import java.util.*;
            2. Scanner 객체의 생성
                화면입력, 파일로도 입력 가능
            3. Scanner 객체를 사용
        */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String input = sc.nextLine();
        System.out.println("input = " + input);
        int num3 = Integer.parseInt(input);
        System.out.println("num3 = " + num3);

        sc.close(); // jvm이 자동으로 관리해 줌
    }
}
