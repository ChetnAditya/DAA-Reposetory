public class mejorele {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,2,1,2};
        int value=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp=temp+1;
                }
            }
            if(temp>arr.length/2 && temp>count){
                value=arr[i];
                count=temp;
            }
        }
        System.out.println(value);
    }
}
