public class BitSet {
    public static void main(String[] args){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        int newBit = bitMask | n;
        System.out.println(newBit);
    }
}
