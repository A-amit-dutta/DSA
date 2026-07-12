class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];
        int sum = 0 , left = 0;
        for(int ele : arr) {
            sum+=ele;
        }
        for(int i = 0; i < n ;i++){
            int right = sum - arr[i] - left;
            a[i] = Math.abs(left-right);
            left += arr[i];
        }
        
        return a;
    }
}