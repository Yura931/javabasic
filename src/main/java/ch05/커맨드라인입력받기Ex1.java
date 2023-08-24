package ch05;

public class 커맨드라인입력받기Ex1 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i] + "\"");
        }
    }
}
