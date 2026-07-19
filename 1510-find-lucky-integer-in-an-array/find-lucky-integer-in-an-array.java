class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int ele : arr) {
            mpp.put(ele, mpp.getOrDefault(ele, 0) + 1);
        }

        int ans = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getKey().equals(entry.getValue())) {
                ans = Math.max(ans, entry.getKey());
            }
        }
        if (ans == Integer.MIN_VALUE)
            return -1;
        return ans;
    }
}