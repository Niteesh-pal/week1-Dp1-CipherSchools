import java.util.*;


public class MinPlatform{

    public static int min(int[] a, int[] d, int n){

        Arrays.sort(a);
        Arrays.sort(d);

        int count = 0; 
        int max = 0;

        int i = 0;
        int j = 0;


        while(i < n){

            if(a[i] <= d[j] ){
                count++;
                if(max < count ){
                    max = count;
                }
                i++;

            }
            else{
                count--;
                j++;
            }
        }

        return max;
        
    }


    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        int train = kb.nextInt();

        int[] a = new int[train];
        int[] d = new int[train];


        for(int i = 0 ; i < train; i++ ){
            a[i] = kb.nextInt();

        }

        for(int j = 0 ; j <train; j++){
            d[j] = kb.nextInt();



        }

        System.out.println(min(a,d,train));
        
    }

}