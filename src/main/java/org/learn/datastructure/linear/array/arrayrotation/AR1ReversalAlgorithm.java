package org.learn.datastructure.linear.array.arrayrotation;

import java.util.Arrays;
import java.util.logging.Logger;

public class AR1ReversalAlgorithm {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        AR1ReversalAlgorithm rotate = new AR1ReversalAlgorithm();

        int[] rotatedArr = rotate.reversalAlgorithm(arr, d, arr.length - 1);

        String output = "result is -> " + Arrays.toString(rotatedArr);
        logger.info(output);
    }

    int[] reversalAlgorithm(int[] arr, int d, int n){
        if(d == 0 || d == n) return arr;

        if(d > n) d = d % n;

        reverse(arr, 0, d -1 );
        reverse(arr, d, n);
        reverse(arr, 0, n);
        return arr;

    }
    void reverse(int[] arr, int start, int end){
        int temp;

        while(start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
