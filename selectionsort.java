public class selectionsort {
    public static void ss(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={21,7,8,2,11};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        ss(arr);
        System.out.println("\nafter sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
