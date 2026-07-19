class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int xor = 0;
        for(int i=1;i<=n;i++){
            xor^=i;
            xor^=arr[i-1];
       }
       return xor;
    }
}