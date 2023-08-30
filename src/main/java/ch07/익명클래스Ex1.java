package ch07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 익명클래스Ex1 {
    public static void main(String[] args) {
        /*
            이름이 없는 일회용 클래스. 정의와 생성을 동시에
            생성, 정의 사용 후 끝!
            조상 또는 인터페이스 이름 사용
        */

        Button b = new Button("Start");
        b.addActionListener(new ActionListener() { // 클래스의 정의와 객체 생성을 동시에
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }
}
