package com.davis.patterns.slidingwindow;

import java.util.Arrays;

public class AverageOfSubarrayOfSizeK {
    public static double[] findAverages(int K, int[] arr) {
        double[] result = new double[arr.length - K + 1];
        int idxStart = 0;
        double sum = 0.0;
        for(int idxEnd=0 ; idxEnd<arr.length;idxEnd++){
            sum +=arr[idxEnd];
            if(idxEnd>=K-1){
                result[idxStart] = sum / K;
                sum -= arr[idxStart];
                idxStart++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println("Averages of subarrays of size K: " + Arrays.toString(result));
    }
}
