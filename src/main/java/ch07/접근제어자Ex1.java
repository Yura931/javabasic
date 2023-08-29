package ch07;

public class 접근제어자Ex1 {
    public static void main(String[] args) {
        /*
            접근 제어자(access modifier)
                private : 같은 클래스 내에서만 접근이 가능하다.
                (default) : 같은 패키지 내에서만 접근이 가능하다.
                protected : 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
                public : 접근 제한이 전혀 없다.

            public > protected > (default) > private

            class에는 public,(default)만
            멤버는 전체 다 사용 가능
        */

        MyParent p = new MyParent();
//        System.out.println("prv = " + p.prv); 에러, 다른 클래스에서 접근하려 함
        System.out.println("dft = " + p.dft);
        System.out.println("prt = " + p.prt);
        System.out.println("pub = " + p.pub);
    }
}

class MyParent {
    private int prv;    // 같은 클래스
    int dft;            // 같은 패키지
    protected int prt;  // 같은 패키지 + 자손(다른패키지)
    public int pub;     // 접근제한 없음.

    public void printMembers() {
        System.out.println("prv = " + prv);
        System.out.println("dft = " + dft);
        System.out.println("prt = " + prt);
        System.out.println("pub = " + pub);
    }
}
