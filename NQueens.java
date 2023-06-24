import java.util.*;

public class NQueens{

    public static boolean isSafe(int[][] board, int row , int col){

            //checking for  same row and same col
        for(int i = 0 ; i<board.length; i++ ){
            if(board[i][col] == 1){
                return false;
            }    

        }

        for(int i = 0 ; i<board.length; i++ ){
            if(board[row][i] == 1){
                return false;
            }    

        }

        //checking left upper

        int r = row;
        for(int c = col; r>=0 && c>=0; r--, c--){
            if(board[r][c] == 1){
                return false;

            }
        }
        //upper right
        r = row;
        for(int c = col; c<board.length && r>=0; r--, c++){
            if(board[r][c] == 1){
                return false;
            }
        }

        //left bottom

        r = row;
        for(int c= col; r<board.length && c>=0;r++, c-- ){
            if(board[r][c] == 1){
                return false;
            }
        }

        //right bottom
        r = row;

        for(int c= col; r<board.length && c<board.length; r++,c++){
            if(board[r][c] == 1){
                return false;
            }
        }

        return true;

    }


    //back tracking 
    public static void solve(int[][] board, int row){

            if(row == board.length){
                printComb(board);
                return;
            }

        for(int i = 0 ; i<board.length; i++){

            if(isSafe(board, row, i)){
                 board[row][i] = 1;
                solve(board, row+1);
                 board[row][i] = 0;
            }
        }
    }

    public static void printComb(int[][] board ){
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0 ; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[][] board = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j= 0; j<n; j++){
                board[i][j] = 0;
            }
        }

        solve(board, 0);


    }

}