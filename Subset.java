import java.util.*;

public class Subset{

    public static void printSubset(ArrayList<Integer> arr){
        if(arr.size() == 0){
            System.out.print("[]");
        }
        for(int i = 0 ; i<arr.size(); i++){
            int ele = arr.get(i);
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void findSubset(int[] arr, int index, ArrayList<Integer> temp){

        if(index == arr.length){
            printSubset(temp);
            return;
        }

         
       
            //include
            temp.add(arr[index]);
        findSubset(arr,index+1,temp);

        //exclude
         temp.remove(temp.size()-1);
        findSubset(arr, index+1, temp);
        
    } 

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        ArrayList<Integer> set =new ArrayList<>(); 

        findSubset(arr,0,set);

    }
}