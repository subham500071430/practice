package dsa;

/*
1539. Kth Missing Positive Number

Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

*/
public class KthMissingNumber {

    public int findKthPositive(int[] arr, int k) {

        if(k <= arr[0] - 1)
            return k;

        if(k > arr[arr.length-1] - arr.length)
            return k + arr.length;

        int low = 0 , high = arr.length - 1;

        while(high - low > 1) {

            int mid = low + (high - low) / 2;

            if(k <= arr[mid] - mid - 1) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return k + low + 1;
    }
}
