public class peak {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 7, 9}; 
        int high = arr.length; 
        int low = 0;

        
        // for (int i = 0; i < n; i++) {
        //     if ((i == 0 || arr[i] > arr[i - 1]) && 
        //         (i == n - 1 || arr[i] > arr[i + 1])) {
                
        //         System.out.println(arr[i]); 
        //     }
        // }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if ((arr[low]>arr[low+1] || arr[mid - 1] < arr[mid]) &&
            ( arr[mid] > arr[mid + 1])) {
                System.out.println(arr[mid]);
                break;
            } else if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
    }
}

