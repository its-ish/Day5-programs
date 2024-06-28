import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.indexOf('z')==-1 && str.indexOf('y')==-1){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}