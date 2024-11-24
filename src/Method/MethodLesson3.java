package Method;

public class MethodLesson3 {
    static void printValue(int... n) {
        for (int a : n) {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        //varags
        printValue(1,3,4,5,6,7,7,8,8,9,3);
    }
}