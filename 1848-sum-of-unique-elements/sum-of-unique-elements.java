class Solution {
    public int sumOfUnique(int[] arr) {
        int[] hash = new int[101];
        
        for(int ele : arr){
            hash[ele]++;
        }

        int sum = 0;

        for(int i = 1 ; i<101;i++){
            if(hash[i]==1)
                sum+=i;
        }
        return sum;
    }
}