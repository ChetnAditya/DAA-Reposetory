public class first {

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        int r=arr.length;
        int c=arr[0].length;
        System.out.println("original matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();

        }
        System.out.println("rotate by 90'");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[c-1-j][i]+" ");
            }
            System.out.println();

        }
       
    }
}