class Solution {
    public int[] leftRightDifference(int[] arr) {
        int n = arr.length;
        int[] leftSum = new int[n] , rightSum = new int[n];
        int[] a = new int[n];
        int temp1 = 0 , temp2 = 0;
        for(int i = 1; i < n ;i++){
            temp1 += arr[i-1];
            leftSum[i] = temp1;
            temp2 += arr[n-i];
            rightSum[n-i-1] = temp2;
        }
        for(int i=0;i<n;i++){
            System.out.print(rightSum[i]+" ");
            a[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return a;
    }
}