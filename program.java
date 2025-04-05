public class program {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                    
                }
                arr[arr.length-1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
