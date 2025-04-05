public class rotatearray {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int k=3;
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.print("[  ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  "); 
        }
        System.out.println("]");
    }
}
