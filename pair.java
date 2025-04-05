public class pair {
    public static void pairsof(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    // System.out.print("("+num[i]+","+num[j]+")");
                    System.out.print("  t ");
                }
                else{
                    System.out.print(" f ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,1,2,2,3,2,3};
        pairsof(numbers);
    }  
}