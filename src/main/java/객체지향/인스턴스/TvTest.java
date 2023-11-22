package 객체지향.인스턴스;

public class TvTest {
    public static void main(String[] args) {
        // 참조변수 : 인스턴스의 주소를 저장하고 있음
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 채널은 " + t1.channel + " 입니다.");
        System.out.println("t2의 채널은 " + t2.channel + " 입니다.");

        t1.channel = 7;
        t1.color = "검정";
        t1.channelDown();

        t2 = t1;    // t1이 저장하고 있는 값(주소)을 t2에 저장
        System.out.println("t1의 현재 채널은 " + t1.channel + " 입니다.");
        System.out.println("t2의 현재 채널은 " + t2.channel + " 입니다.");


    }
}

class Tv {

    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channel;


    // Tv의 기능(메서드)
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}