import java.util.Scanner;
public class Threenum {
    public static void main(String[] args) {
        Threenum threenum = new Threenum();
        System.out.println(threenum.addThreeNumbers(100,200,300));
    }
    public int addThreeNumbers(int a, int b, int c) {
        return a + b + c;
    }
}