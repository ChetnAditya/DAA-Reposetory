class mergearray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[m + n];

        while (i < m && j < n) {  
            if (nums1[i] < nums2[j]) {
                c[k] = nums1[i];
                i++;
            } else {
                c[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {  
            c[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) { 
            c[k] = nums2[j];
            j++;
            k++;
        }

        
        for (int x = 0; x < m + n; x++) {
            nums1[x] = c[x];
        }
        for (int x = 0; x < m + n; x++) {
            System.out.print(nums1[x] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        new mergearray().merge(nums1, m, nums2, n);
    }
}
