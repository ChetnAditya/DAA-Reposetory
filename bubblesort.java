public class bubblesort {

    public static void bbs(int arr[]){
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        public static void main(String[] args) {
            int arr[]={25,3,45,8,44,72,1,55,19};
            System.out.println("before sorting");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            bbs(arr);
            System.out.println("\nafter sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
