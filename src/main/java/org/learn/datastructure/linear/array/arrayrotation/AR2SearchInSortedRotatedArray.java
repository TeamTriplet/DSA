package org.learn.datastructure.linear.array.arrayrotation;

import java.util.logging.Logger;

public class AR2SearchInSortedRotatedArray {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2,};
        int element = 4;

        AR2SearchInSortedRotatedArray searchInSortedRotatedArray = new AR2SearchInSortedRotatedArray();

        int indexOfElement = searchInSortedRotatedArray.findElementInSortedAndRotatedArray(arr, element, 0, 6);

        String output = "index is -> " + indexOfElement;
        logger.info(output);
    }

    int findElementInSortedAndRotatedArray(int[] arr, int element, int left, int right){
        if(left > right) return -1;

        int mid = (left + right)/2;

        if(element == arr[mid]) return mid;

        /* If arr[left...mid] first subarray is sorted */
        if(arr[left] > arr [mid]){
            if(element < arr[mid]) return findElementInSortedAndRotatedArray(arr, element, left, mid - 1);
            else return findElementInSortedAndRotatedArray(arr, element, mid+1, right);
        }else{
            /* If arr[l..mid] first subarray is not sorted, then arr[mid... right] must be sorted subarray*/
            if(element > arr[mid]) return findElementInSortedAndRotatedArray(arr, element, mid+1, right);
            else return findElementInSortedAndRotatedArray(arr, element, left, mid - 1);
        }
    }
}
