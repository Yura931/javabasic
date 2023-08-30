package ch07;

public class InstanceOfEx1 {
    public static void main(String[] args) {
        /*
            instanceof 연산자
                : 참조변수의 형변환 가능여부 확인에 사용. 가능하면 true 반환
                : 형변환 전에 반드시 instanceof로 확인해야 함
        */

        Car car = new Car();
        FireEngine f = new FireEngine();
        doWork(car);
        doWork(f);

        // 자신과 조상에 대해 참을 반환
        // 조상으로 형변환이 다 가능하기 때문
        System.out.println("f instanceof Object = " + (f instanceof Object));
        System.out.println("f instanceof Car = " + (f instanceof Car));
        System.out.println("f instanceof FireEngine = " + (f instanceof FireEngine));

        // Car 인스턴스와 Car를 상속받은 FireEngine은 instance가 같지 않음
        System.out.println("car instanceof FireEngine = " + (car instanceof FireEngine));
    }

    static void doWork(Car c) { // Car, FireEngine, Ambulance 등 Car와 상속받은 객체들이 다 들어올 수 있기 때문에 실제 들어온 인스턴스가 무엇인지 확인 할 필요가 있음
        System.out.println("c = " + c);
        System.out.println(c instanceof FireEngine);
        if (c instanceof FireEngine) {  // instance가 FireEngine인 경우에만 water() 호출 가능
            FireEngine fe = (FireEngine) c;
            fe.water();
        } else {
            System.out.println("FireEngine 아님");
        }
    }
}
