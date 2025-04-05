public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,12,18,20,21};
        int low=0;
        int high=arr.length-1;
        int target=20;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                System.out.println("element found at index "+mid);
                break;
            }
            
        }
    }
}
