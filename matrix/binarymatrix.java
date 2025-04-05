public class binarymatrix {
    public static void main(String[] args) {
        
        int arr[][]={{1,1,1,1},{1,0,0,1},{1,1,0,1},{0,1,1,1}};

        int r=arr.length;
        int c=arr[0].length;
        System.out.println("original matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println(); 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0){
                    for(int k=i;k<r;k++){
                        arr[k][j]=-1;
                    }
                    for(int k=j;k<c;k++){
                        arr[i][k]=-1;
                    }
                }
                System.err.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
