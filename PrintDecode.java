import java.util.*;


public class PrintDecode{



   public static void decode(String s, String output){

    if(s.length()==0 ){
        System.out.println(output);
        return;
    }

        String str = s.substring(0,1);
        int  num1 = Integer.parseInt(str);
        char ch = (char)(num1 + 96);
        
        decode(s.substring(0,1), output+ch);

        String ptr = s.substring(0,2);
        int num2 = Integer.valueOf(ptr);

        if(num2>=10 && num2<=26){
            char dh = (char) (num2 +96);
            decode(s.substring(0,2),output+dh);
        }
        return;


   }

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        String digit = kb.next();

        decode(digit," ");
    }
}