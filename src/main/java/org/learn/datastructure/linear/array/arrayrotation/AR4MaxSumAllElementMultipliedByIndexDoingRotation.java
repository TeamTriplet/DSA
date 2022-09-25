package org.learn.datastructure.linear.array.arrayrotation;

import java.util.logging.Logger;

public class AR4MaxSumAllElementMultipliedByIndexDoingRotation {
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] arg){
        int[] arr = {10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        AR4MaxSumAllElementMultipliedByIndexDoingRotation maxSumAllElementMultipliedByIndexDoingRotation = new AR4MaxSumAllElementMultipliedByIndexDoingRotation();
        int sum = maxSumAllElementMultipliedByIndexDoingRotation.rotateAndMultiplyElementWithItsIndexAndSum(arr, arr.length);
        String output = "max sum of the element of array when multiplied by there index is : " + sum;
        logger.info(output);
        int sortedArraySum = maxSumAllElementMultipliedByIndexDoingRotation.rotateAndMultiplySortedArrayElementToItsIndexAndSum(arr, arr.length);
        String sortedOutput = "max sum of the element of sorted array when multiplied by there index is : " + sortedArraySum;
        logger.info(sortedOutput);
    }
    int rotateAndMultiplyElementWithItsIndexAndSum(int[] arr, int n){
        int arrSum = 0;
        int currVal = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++){
            arrSum += arr[i];
            currVal += i * arr[i];
        }

        for(int j = 1; j < n; j++){
            currVal = currVal + arrSum - n * arr[n-j];
            if(maxSum < currVal){
                maxSum = currVal;
            }
        }
        return maxSum;
    }

    int rotateAndMultiplySortedArrayElementToItsIndexAndSum(int[] arr, int n){
        int maxSum = 0;
        int pivot = findPivot(arr, n);
        int diff = n - 1 - pivot;

        for(int i = 0; i < n; i++){
            maxSum += arr[i] * ((i + diff) % n);
        }
        return maxSum;
    }

    int findPivot(int[] arr, int n){
        for(int i = 0; i < n; i++)  if(arr[i] > arr[i+1])   return i;
        return 0;
    }
}
