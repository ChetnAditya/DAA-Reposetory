public class firstlastoccurence {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,5};
        int l=0;
        int h=arr.length-1;
        int target=4;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                h=mid-1;
            }
            else if(arr[mid]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        
    }
}
