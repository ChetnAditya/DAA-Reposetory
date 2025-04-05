public class mergesort {
    public static void merge(int brr[],int l,int mid,int r){
        int m1=mid-l+1;
        int m2=r-mid;
        int a[]=new int[m1];
        int b[]=new int[m2];
        for(int i=0;i<m1;i++){
            a[i]=brr[l+i];
        }
        for(int i=0;i<m2;i++){
            b[i]=brr[mid+1+i];
        }
        int i=0,j=0,k=l;
        while(i<m1 && j<m2){
            if(a[i]<b[j]){
                brr[k]=a[i];
                i++;
            }
            else{
                brr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<m1){
            brr[k]=a[i];
            i++;
            k++;
        }
        while(j<m2){
            brr[k]=b[j];
            j++;
            k++;
        }
    }
    public static void mergesort(int brr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergesort(brr,l,mid);
            mergesort(brr,mid+1,r);
            merge(brr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int brr[]={10,50,20,30,90,80,70};
        int n=brr.length;
        System.out.println("original array :");
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        mergesort(brr,0,n-1);
        System.out.println("sorted array :");
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }  
    }
}
