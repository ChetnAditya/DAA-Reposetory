public class removeduplicate {

    public static void removeduplicate(int arr[]) {
        
        for(int i=0;i<arr.length;i++){
            int dup=0;
            for(int j=i;j<arr.length-1;j++){
            dup^=arr[j];
            if(dup==0){
                arr[i+1]=0;
            }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,4,5};
        
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             arr[j]=0;
        //         }
        //     }
            
            
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        removeduplicate(arr);
       


    }
}
