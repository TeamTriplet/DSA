package org.learn.datastructure.linear.array.arrayrotation;

import java.util.logging.Logger;

public class AR3SearchPairWithSumInRotatedSortedArray {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args){
        int[] arr = {3, 4, 5, 6, 7, 1, 2,};
        int sum = 7;
        AR3SearchPairWithSumInRotatedSortedArray searchPairWithSumInRotatedSortedArray = new AR3SearchPairWithSumInRotatedSortedArray();
        boolean pairExist = searchPairWithSumInRotatedSortedArray.doesPairExist(arr, sum, arr.length);
        String output = "Pair Exist: " + pairExist;
        logger.info(output);
    }

    boolean doesPairExist(int[] arr, int sum, int size){
        int i;
        int temp;
        for(i = 0; i < size - 1; i++){
            if(arr[i] < arr[i+1]) break;
        }
        int left = i;
        int right = i + 1;
        while(left >= 0 && right < size){
            temp = arr[left] + arr[right];
            if(temp == sum) return true;
            if(temp > sum) left--;
            if(temp > sum) right++;
        }
        return false;
    }
}
