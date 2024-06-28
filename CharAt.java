import java.util.Scanner;
public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char last = str.charAt(str.length()-1);
        char last1 = str.charAt(str.length()-2);
        System.out.print(last1);
        System.out.print(last);
    }
}