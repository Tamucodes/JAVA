public class clearBit {
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int Bitmask = 1<<pos;
        int notBitmask = ~(Bitmask);
        int newNumber = notBitmask &n;

        System.out.print(newNumber);
        
    }
    
}
