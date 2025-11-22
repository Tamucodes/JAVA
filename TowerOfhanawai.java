//rules
//1. only one disk can be moved at a time
//2. smaller disk are always placed on the top of larger disks.
import java.util.*;
public class TowerOfhanawai{
    public static void towerofHanoi(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("transer disk " + n + " from " + source + " to " + destination);
            return;
        }
        towerofHanoi(n-1, source, destination, helper);
        System.out.println("transfer disk " + n + " from " + source + " to " + destination);
        towerofHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        towerofHanoi(n,"S", "H","B");
        sc.close();
    }
}