import java.util.*;

public class updateBit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        System.out.print("Enter the operation(1 or 0): ");
        int oper = sc.nextInt();
        int bitMask = 1<<pos;
        if(oper ==1){
            int newBit = bitMask | n;
            System.out.println(newBit);
        }else{
            int notnumber = ~(bitMask);
            int newNumber = notnumber & n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}