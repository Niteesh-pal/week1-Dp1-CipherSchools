import java.util.*;
public class GeneratePranthesis{

    // public static void generate(int n){
    //     if(n<=0){
    //         return;
    //     }

    //     System.out.print("(" +" ");
    //     generate(n-1);
    //     System.out.print(")"+ " ");
    // }

    public static void helper(int left , int right, String output){

        if(left > right){
            return;
        }

        if(left == 0 && right == 0){
            System.out.println(output);
            return;

        }

        if(left > 0){
            
            helper(left -1, right, output+"(");
        }

        if(right > 0){
            helper(left, right-1 , output+")");
        }
    }

    public static void  generate(int n){
        helper(n,n,"");
    }

    public static void main( String[] args){
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        generate(n);

    }
}