# Array Rotations
***
| [GFG](https://www.geeksforgeeks.org/array-data-structure/?ref=lbp#:~:text=Arrays%20in%20C%23-,Array%20Rotations%20%3A,-Program%20for%20array)
|
***
<ol><li><a href="https://www.geeksforgeeks.org/array-rotation/">Program for array rotation</a></li>
    <li><a href="https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/">Reversal algorithm for array rotation</a><br>
        <ul> 
            <li>reverse(arr, 0, d - 1); </li>
            <li>reverse(arr, d, n); </li>
            <li>reverse(arr, 0, n); </li>
        </ul>
    </li>
    <li><a href="https://www.geeksforgeeks.org/block-swap-algorithm-for-array-rotation/">Block swap algorithm for array rotation</a></li>
    <li><a href="https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array/">Search an element in a sorted and rotated array</a></li>
        <ul>
            <li>find mid of array, then find sorted part</li>
            <li>if element is in between sorted part, search in it using binary search, else search in other part</li>
        </ul>
    <li><a href="https://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/">Given a sorted and rotated array, find if there is a pair with a given sum</a></li>
        <ul>
            <li>find pivot (index of largest or smallest element)</li>
            <li>add largest and smallest element & compare to sum</li>
            <li>if equal to sum return true, if greater than sum move left index toward start, if smaller than sum move right index toward end</li>
            <li>if sum not found return false</li>
        </ul>
    <li><a href="https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/">Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed</a></li>
        <ol>
            <li>find nextSum from current Sum and take its max, untill all rotations are calculated </li>
                <ul>
                    <li> arrSum, R<sub>0</sub></li>
                    <li> R<sub>0</sub> = ∑<b>(i * arr[i])</b> with 0 rotation</li>
                    <li> <strong>R<sub>j</sub> = R<sub>j-1</sub> + arrSum – n * arr[n-j]</strong></li>
                </ul>
            <li>If array is sorted and rotated, find pivot, multiply each element by its index + (length - 1 - pivot)</li>
        </ol>
    <li><a href="https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/">Find the Rotation Count in Rotated Sorted array</a></li>
        <ul>
            <li>pivot element index (Binary - O(logn) / Linear Search - O(n))</li>
        </ul>
    <li><a href="https://www.geeksforgeeks.org/quickly-find-multiple-left-rotations-of-an-array/">Quickly find multiple left rotations of an array</a></li><li><a href="https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/">Find the minimum element in a sorted and rotated array</a></li><li><a href="https://www.geeksforgeeks.org/reversal-algorithm-right-rotation-array/">Reversal algorithm for right rotation of an array</a></li><li><a href="https://www.geeksforgeeks.org/find-a-rotation-with-maximum-hamming-distance/">Find a rotation with maximum hamming distance</a></li><li><a href="https://www.geeksforgeeks.org/queries-left-right-circular-shift-array/">Queries on Left and Right Circular shift on array</a></li><li><a href="https://www.geeksforgeeks.org/print-left-rotation-array/">Print left rotation of array in O(n) time and O(1) space</a></li><li><a href="https://www.geeksforgeeks.org/find-element-given-index-number-rotations/">Find element at given index after a number of rotations</a></li><li><a href="https://www.geeksforgeeks.org/split-array-add-first-part-end/">Split the array and add the first part to the end</a></li>
</ol>