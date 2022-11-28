package com.davis.array;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        int[] arr3 = new int[m+n];
// Traverse both array
        while (i<m && j <n)
        {
// Check if current element of first
// array is smaller than current element
// of second array. If yes, store first
// array element and increment first array
// index. Otherwise do same with second array
            if (nums1[i] < nums2[j])
                arr3[k++] = nums1[i++];
            else
                arr3[k++] = nums2[j++];
        }
        // Store remaining elements of first array
        while (i < m)
            arr3[k++] = nums1[i++];

        // Store remaining elements of second array
        while (j < n)
            arr3[k++] = nums2[j++];

        return arr3;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,0,0,0};
        int b[] = {2,5,6};
        int r[] = new MergeSortedArray().merge(a, 3, b, 3);
        for( int i : r){
            System.out.print(i+" ");
        }

    }
}
