/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
 * Platform     : GFG
 * Difficulty   : Easy
 */

class Solution {
    void segregate0and1(int[] arr) {
        int i = 0;
        int j = 0;
        while(j<arr.length){
            if(arr[j]!=1){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
    }
}

