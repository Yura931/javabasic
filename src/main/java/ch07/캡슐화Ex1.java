package ch07;

public class 캡슐화Ex1 {
    public static void main(String[] args) {
        /*
            접근제어자를 사용하는 이유
                : 외부로부터 데이터를 보호하기 위해서
                : 대입연산자로 직접 값을 넣게하면 사용목적과 다르게 아무 값이나 막 들어가게 됨
                : 직접 접근은 막고 메서드를 통해 간접 접근 허용
                : 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서

            메서드를 이용해 간접 접근 하는 것 : 캡슐화
        */

        Time t = new Time();
        t.setHour(21);
        System.out.println("t.getHour() = " + t.getHour());
        t.setHour(100);
        System.out.println("t.getHour() = " + t.getHour());
    }
}


class Time {
    private int hour;       // 0 ~ 23사이의 값을 가져야 함.
    private int minute;
    private int second;

    public void setHour(int hour) {
        if(isValidHour(hour)) return;
        this.hour = hour;
    }
    public int getHour() {
        return hour;
    };

    // 접근제어자 범위는 최소화 시켜두고 확장시켜나가는 방식으로 해야 좋음
    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }
}
