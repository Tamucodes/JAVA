import java.util.*;

public class TwoDArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns");
        int n = sc.nextInt();

        int[][] numbers = new int[m][n];

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                System.out.print(numbers[i][j]);
            }
        }
        sc.close();
    }
}