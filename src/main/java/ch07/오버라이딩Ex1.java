package ch07;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class 오버라이딩Ex1 {
    public static void main(String[] args) {

        /*
            (메서드)오버라이딩(overriding) : 덮어쓰다
            - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
            - 선언부 변경불가
            - 내용만 변경가능

            오버라이딩의 조건
            1. 선언부(반환타입, 메서드 이름, 매개변수 목록)가 조상 클래스의 메서드와 일치해야 한다.
            2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다. (public, protected, default, private)
            3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
        */

        MyPoint3D p = new MyPoint3D(3, 5, 7);

//        p.x = 3;
//        p.y = 5;
//        p.z = 7;

        System.out.println(p.getLocation());
        System.out.println(p);
    }
}

class MyPoint {
    int x, y;
    String getLocation(){
        return "x:" + x +", y: " + y;
    }
}

class MyPoint3D extends MyPoint {
    int z;

    MyPoint3D() {}
    MyPoint3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // 조상의 getLocation()을 오버라이딩
    String getLocation(){
        return "x:" + x +", y: " + y + ", z: " + z;
    }
    
    // Object클래스의 toString()을 오버라이딩
    public String toString() {
        return "x:" + x +", y: " + y + ", z: " + z;
    }
}


/*
    오버로딩(overloading) : 기존에 없는 새로운 메서드를 정의하는 것
    오버라이딩(overriding) : 상속받은 메서드의 내용을 변경하는 것(change, modify)
*/