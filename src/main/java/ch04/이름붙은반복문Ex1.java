package ch04;

public class 이름붙은반복문Ex1 {
    public static void main(String[] args) {
        /*
            반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다.
        */
        
        Loop1 :
        for (int i = 2; i <= 9 ; i++) {
            for(int j = 1; j <= 9; j++) {
                if(j==5)
                    break Loop1; // Loop1인 for i 문을 빠져나감
//                break; // for j 문을 빠져나감
//                continue Loop1;
//                continue;
                System.out.println(i +"*" + j + "=" + i*j);
            } // end of for i
            System.out.println();
        } // end of Loop1
    }
}
