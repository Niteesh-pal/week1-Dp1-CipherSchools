import java.util.*;

public class TrappingRainwater{

    public static int rain(int[] arr){

        int n = arr.length;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = arr[0];

        for(int i = 1; i <n; i++){
            left[i] = Math.max(left[i-1],arr[i]);

        } 
        right[n-1] = arr[n-1];

        for(int j = n-2; j>=0; j--){
            right[j] = Math.max(right[j+1], arr[j]);
        }

        int ans = 0;

        for(int i = 0; i<n; i++){
            ans = ans + Math.min(left[i],right[i])- arr[i];
        }

        return ans;
    }

    public static void main(String[] args){

    Scanner kb = new Scanner(System.in);

    int n = kb.nextInt();
    int[] arr = new int[n];

    for(int i =0 ;i <n ; i++){
        arr[i]=kb.nextInt();
    }

    System.out.println(rain(arr));
    }
}