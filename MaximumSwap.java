import java.util.*;
public class MaximumSwap{

    public static String swap(String s, int i , int j){

        char ith= s.charAt(i);
        char jth = s.charAt(j);

        String left = s.substring(0,i);
        String middle = s.substring(i+1, j);
        String right = s.substring(j+1, s.length());

        String str = left + jth+ middle+ ith+right;

        return str;
    }
 
    public static String helper(String s, String max, int index ){

        if(Integer.parseInt(s) > Integer.parseInt(max)){
            max = s;
        }
        if(index >= s.length()-1){
            return max;
        }

        for(int i = index+1; i<s.length(); i++){

            if(s.charAt(index) < s.charAt(i)){
                    String swapped = swap(s, index, i);
                    helper(swapped,max, index+1);
            }
        }

        return max;
    }

    public static String findMax(String s){
        String max= helper(s,"0", 0);
        return max;
    } 

    public static void main(String[] args){

            Scanner kb = new Scanner(System.in);

            String s = kb.next();

            System.out.print(findMax(s));


        
    }
}