public class sorted {
    public static void main(String[] args) {
        int arr[]={1,2,5,9,2};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("array is unsorted");
                break;
            }
            else{
                System.out.println("array is sorted");
                break;
            }
        } 
    }
}
