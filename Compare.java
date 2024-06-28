import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        if((s1.equalsIgnoreCase(s2))){
            if(!(s1.equalsIgnoreCase(s3))){
                System.out.println(s3);
            }
        }
        else if((s2.equalsIgnoreCase(s3))){
            if(!(s2.equalsIgnoreCase(s1))){
                System.out.println(s1);
            }
        }
        else if((s3.equalsIgnoreCase(s1))){
            if(!(s3.equalsIgnoreCase(s2))){
                System.out.println(s2);
            }
        }
    }
}