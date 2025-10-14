import java.util.*;

public class FunctionMethod{
    public static int calcSum(int a , int b) {
        int sum = a +b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calcSum(a,b);
        System.out.print(sum);

        sc.close();
        
    }
}