package ch06;

import java.util.Arrays;

class Tv{}

public class 객체배열Ex1 {
    public static void main(String[] args) {
        // 참조변수 배열
        Tv[] tvArr = new Tv[3]; // Tv타입 참조변수 3개
        tvArr[0] = new Tv();
        tvArr[1] = new Tv();
        tvArr[2] = new Tv();

        System.out.println(Arrays.toString(tvArr));
    }
}
