package ch05;

public class 이차원배열Ex1 {
    public static void main(String[] args) {
        /*
            2차원 배열
                : 1차원 배열이 여러개 모인 것
                : 1차원 배열의 배열
            3차원 배열
                : 2차원 배열이 여러개 모인 것

            ```
        */

        int[][] score = new int[4][3]; // 4행 3열  / 4 * 3 = 12 / int 값 12개 / 행 index(0 ~ 행의 길이 -1), 열 index(0 ~ 열의 길이 -1)
        score[0][0] = 100; // 배열 score의 1행 1열에 100을 저장
        System.out.println(score[0][0]);


        // 2차원 배열의 생성과 초기화
        int[][] arr = {
                        {100, 100, 100}, // 이 한줄이 1차원 배열 이름 : arr[0]
                        {20, 20, 20, 20}, // arr[1]
                        {30, 30, 30}, // arr[2]
                        {40, 40, 40}  // arr[3]
                      };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // arr.length = 4
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d]=%d%n", i, j, arr[i][j]);
                sum += arr[i][j];
            }
        }

        System.out.println("sum = " + sum);
    }
}
