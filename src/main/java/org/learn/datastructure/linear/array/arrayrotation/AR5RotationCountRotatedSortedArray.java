package org.learn.datastructure.linear.array.arrayrotation;

import java.util.logging.Logger;

public class AR5RotationCountRotatedSortedArray {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args){
        int[] arr = {7, 9, 11, 12, 5};
        AR5RotationCountRotatedSortedArray ar5RotationCountRotatedSortedArray = new AR5RotationCountRotatedSortedArray();
        int count = ar5RotationCountRotatedSortedArray.rotationCount(arr, arr.length);
        String output = "Array is rotated: " + count + " times";
        logger.info(output);
    }

    int rotationCount(int[] arr, int n){
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(left <= right) {
            mid = (left + right)/2;
            if(arr[mid] <= arr[(mid - 1 + n) % n] && arr[mid] <= arr[(mid + 1) % n])  return mid;
            if(arr[mid] >= arr[left])    left = mid + 1;
            if(arr[mid] <= arr[right])   right = mid - 1;
        }
        return mid;
    }

}
