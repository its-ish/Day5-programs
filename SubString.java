import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String output = str.substring(0,str.indexOf("."));
        System.out.println(output);
    }
}