import java.util.*;
public class treeprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the tree : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the tree : ");
        int cols = sc.nextInt();
        System.out.println("Enter the elements");
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
        System.out.println();
        System.out.println("Enter an element");
        int target = sc.nextInt();
        if(target%cols==0 || target%cols==1){
            System.out.println("Mango tree");
        }
        else if(target>0 && target<=cols){
            System.out.println("Mango tree");
        }
        else{
            System.out.println("Not a Mango tree");
        }
    }
}