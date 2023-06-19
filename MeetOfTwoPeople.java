class MeetOfTwoPeople{

    public static boolean isMeet(int p1, int p2, int s1, int s2){
        
        if(p1 > p2 && s1 > s2 ){
            return false;
        }
        if(p2>p1 && s2 > s1 ){
            return false;
        }

        while(p1 >= p2  || p2>=p1){

            if(p1 == p2){
                return true;
            }
            p1 = p1+s1;
            p2 = p2+s2;

        }

        return false;
    }

    public static boolean isMeetOptimized(int p1, int p2, int s1, int s2){

        if(p1 > p2 && s1 > s2 ){
            return false;
        }
        if(p2>p1 && s2 > s1 ){
            return false;
        }

        int d = Math.abs(p1-p2);
        int s = Math.abs(s1-s2);

        if(d%s == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        int p1 = 2;
        int s1 = 3;

        int p2 = 5;
        int s2 = 2;

        System.out.print(isMeetOptimized(p1, p2, s1, s2));
    }
}