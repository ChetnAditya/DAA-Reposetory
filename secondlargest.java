public class secondlargest {
    public static void main(String[] args) {
        int arr[]={1,2,5,9,2};
        int l=9;
        int sl=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>sl && arr[i]<l){
                sl=arr[i];
            }
        }
        System.out.println("second largest ="+sl);


    }
}
