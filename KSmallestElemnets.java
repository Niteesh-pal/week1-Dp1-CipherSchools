public class KSmallestElemnets{

    public static void kElements(int[] arr, int k){
        
        for(int idx = k ; idx< arr.length; idx++){
            int curr = arr[idx];
        

        int max=  arr[k-1];

        int maxPosition = k-1;

        for(int ridx = k-2; ridx >=0; ridx--)
        {
            if(arr[ridx]> max){
                max= arr[ridx];
                maxPosition = ridx;
            }
        }
        if(curr < max){

            while(maxPosition < k-1){

           arr[maxPosition] = arr[maxPosition+1];
           maxPosition++;
            }

           arr[k-1] = curr;
            
        }
        }
    

        for(int i = 0; i<k ; i++){
            System.out.println(arr[i]+ " ");
        }

    }

    public static void main(String[] args){

        int[] arr = {50, 25,100,200,30};

        kElements(arr,2);
        
    }
}