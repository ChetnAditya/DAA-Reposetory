public class totaloccurence {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,4,5};
        int target=4;
        int low=0;
        int c=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                c=c+1;
                high=mid-1;
            }
            else if(arr[mid]<target){
                if(arr[mid+1]==target){
                    c=c+1;
            }
                low=mid+1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(c);
    }
}