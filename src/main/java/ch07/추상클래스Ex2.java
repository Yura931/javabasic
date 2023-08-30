package ch07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class 추상클래스Ex2 {
    public static void main(String[] args) {
        /*
            추상화(불명확) <-> 구체화(명확)
            추상화된 코드는 구체화된 코드보다 유연하다. 변경에 유리
            말을 애매하게 해 두면 피해나갈 곳이 있다.... 같은 느낌?... 말 바꾸기 쉽다..
                
            추상클래스의 작성
                : 여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나
                    기존클래스의 공통 부분을 뽑아서 추상클래스를 만든다.
        */

        Unit[] group = { new Marine(), new Tank() };

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);    // Unit 클래스를 상속받은 객체들, Unit클래스에 있는 move추상메서드를 구현클래스에서 구현한 메서드 호출
        }

        Object[] group2 = new Object[3];
        group[0] = new Marine();

        for (int i = 0; i < group2.length; i++) {
//            group2[i].move(100, 200); -> 에러!! Object클래스에 move메서드가 정의되어 있지 않음!
        }

        GregorianCalendar cal = new GregorianCalendar(); // 구체적, 변경에 불리, 달력 종류 바꾸고 싶을 때 모든 생성된 객체를 다 변경해야 하는 단점
        Calendar cal2 = Calendar.getInstance(); // 추상적 Calendar 자손 객체를 반환, getInstance() 내용만 변경하면 됨, 호출하는 시점에서 코드변경 필요 없음
    }
}

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
}

class Tank extends Unit {

    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
}