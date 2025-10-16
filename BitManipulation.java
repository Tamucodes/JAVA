public class BitManipulation {
    public static void main(String[] args){
        int n = 5;
        int pos = 3;
        int bitMask = 1<<pos;
        
        if((bitMask & n)==0){
            System.out.print("bit was zero");
        }else{System.out.print("the bit was one");
    }
    }
}