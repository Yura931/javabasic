package ch04;

public class 반복문breakEx1 {
    public static void main(String[] args) {
        /*
            break문
                : 자신이 포함된 하나의 반복문을 벗어난다.
        */

        int sum = 0;
        int i = 0;

        while(true) { // 무한 반복
            if(sum > 100)
                break; // 자신이 속한 하나의 반복문을 벗어난다.
            ++i;
            sum += i;
        } // end of while

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);

        sum = 0;
        i = 0;

        while(sum <= 100) {
            ++i;
            sum += i;
        }

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
