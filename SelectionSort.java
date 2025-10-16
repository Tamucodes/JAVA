// one swap in a single iteration
// example 7 8  3 1 2
public class SelectionSort{
    public static void printArr(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] nums = {7,8,3,1,2};

        //selection sort
        for(int i=0;i<nums.length -1;i++){
            int smallest = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[smallest] >nums[j]){
                    smallest=j;
                }
            }
            int temp  = nums[smallest];
            nums[smallest] = nums[i];
            nums[i]= temp;
        }
        printArr(nums);
        
    }
}