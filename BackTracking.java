public class BackTracking {
    public static void Permutation(String str, String perm, int idx){
        if(str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char newCurr = str.charAt(i);
            String  newStr = str.substring(0,i) + str.substring(i+1);
            Permutation(newStr, perm + newCurr, idx +1);
        }
    }
    public static void main(String[] args){
        String str = "ABC";
        Permutation(str, "", 0 );
    }
}
//time complexity = n * n!
// space complexity = n!