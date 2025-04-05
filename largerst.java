public class largerst {
    public static void main(String[] args) {
        int arr[]={1,5,2,6};
        int MAX=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>MAX){
                MAX=arr[i];
            }

        }
        System.out.println("largest no is:"+MAX);
    }
}
