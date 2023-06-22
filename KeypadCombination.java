import java.util.*;


public class KeypadCombination{

   public static Map<Character, String> map = new HashMap<>();
   public static List<String> list = new ArrayList<>();

   public static void combination(String output, String digit, int indx){

            if(output.length() == digit.length()){
                list.add(output);
                return;
            }

            char ch = digit.charAt(indx);
            String value = map.get(ch);

            for(int i = 0 ; i<value.length(); i++){
                combination(output+value.charAt(i), digit, indx+1);
            }
   }

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);

        String digit =  kb.next();
        
        String output = "";

        map.put('2', "abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        combination(output, digit, 0);

        for(String res : list){
            System.out.println(res);
        }

    }
}