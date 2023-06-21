
import java.util.*;

public class MatrixSort{

    public static boolean isExit(int[][] mat , int n){
        
        int row = mat.length;
        int col = mat[0].length;

        for(int i = 0; i<row; i++){
            
            if(mat[i][0]<= n && mat[i][col-1] >=n){

                if(mat[i][0] == n){
                    return true;
                }
                if(mat[i][col-n] == n){
                    return true;
                }

                for(int j = 1; j <col -1; j++){
                    if(mat[i][j] == n ){
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args){
    
    Scanner kb = new Scanner(System.in);

    int size = kb.nextInt();
    int[][] mat = new int[size][size];

    for(int i = 0 ; i< size; i++){
        for(int j = 0 ; j <size; j++){
            mat[i][j] = kb.nextInt();
        }
    }
     int n = kb.nextInt();

    System.out.println(isExit(mat, n));
        


    }
}