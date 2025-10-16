import java.util.*;

public class bubbleSort{
    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Arry:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the elements: ");
        //taking input
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //time complexity = O(n^2)
        //sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                    //swap
                    if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
        sc.close();
    }
}