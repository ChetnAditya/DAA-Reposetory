public class squreroot {
    public static void main(String[] args) {
        int num=228;
        double sq=num/2;
        while(sq*sq>num){
            sq=(sq+num/sq)/2;
        }
        System.out.println(sq);
    } 
}