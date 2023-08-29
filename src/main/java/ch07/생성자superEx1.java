package ch07;

public class 생성자superEx1 {
    public static void main(String[] args) {
        /*
            super() : 조상의 생성자
                    : 조상의 생성자를 호출할 때 사용
                    : 조상의 멤버는 조상의 생성자를 호출해서 초기화
                    / this() : 생성자, 초기화블럭 상속x
        */
    }
}

class SuperChild extends SuperParent {
    int z;
    SuperChild(int x, int y, int z) {
        super(x, y); // 조상이 선언한 멤버들을 초기화, 조상클래스의 생성자 Point(int x, int y)를 호출, 
                     // SuperParent 클래스에 매개변수를 가진 생성자만 존재하기 때문에 컴파일러가 기본생성자를 자동으로 만들어주지 않음,
                     // super(x, y)를 호출하지 않을 경우 SuperParent에서 기본생성자를 호출할 수 없기 때문에 에러가 남
                     // super(x, y)로 매개변수를 가진 생성자를 호출하거나, SuperParent에 기본생성자를 생성해주면 문제없음
                     // 조상의 멤버는 조상의 생성자가 초기화하도록 하는게 맞으므로 super(x, y)를 사용해 초기화시켜주는것이 더 옳은 방식

        this.z = z;  // 자신의 멤버를 초기화
    }
}

class SuperParent {
    int x, y;
    
    /*
        - 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.
            그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입
    */
    
    SuperParent() {
        this(0, 0); // 생성자의 첫 줄에 생성자 호출하므로 ok
    }
    SuperParent(int x, int y) {
//        super();      // 이 생성자의 경우 첫 줄에 생성자 호출을 하지 않으므로 컴파일러가 자동으로 super()를 삽입 해 줌, 부모가 없는 클래스는 항상 Object를 상속받는것 명심! Object의 생성자를 super()로 호출한다 생각하면 됨
        this.x = x;
        this.y = y;
    }
}
