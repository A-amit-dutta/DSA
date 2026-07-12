class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0,preSum = 0;
        for(int ele : arr){
            sum+=ele;
        }
        for(int i=0;i<arr.length;i++){
            if(sum-arr[i]==2*preSum) return i;
            preSum+=arr[i];
        }
        return -1;
    }
}