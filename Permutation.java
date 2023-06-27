import java.util.*;

public class Permutation{

    public static void premut(String s, String str){

            if(s.length() == 0){
                System.out.println(str);
                return;
            }

        for(int i = 0 ; i<s.length(); i++){
            // premut(s.substring(1),str+s.charAt(0));

            String prt = s.substring(0,i)+s.substring(i+1);
            premut(prt,str+s.charAt(i));
        }
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String s= kb.next();

        premut(s,"");
    }
}