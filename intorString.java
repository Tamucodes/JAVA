import java.util.*;

public class intorString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1 = "Tony";
        String name2 = "Tony";

        //comparing two strings
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("not equal Strings");
        }
        String half = name1.substring(0,2);
        System.out.println(half);
    }
}