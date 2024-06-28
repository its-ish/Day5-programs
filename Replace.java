import java.util.Scanner;
public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String output = s.replace('a', 'b')
                .replace('e', 'f')
                .replace('i', 'j')
                .replace('o', 'p')
                .replace('u', 'v');
        System.out.println(output);
    }
}