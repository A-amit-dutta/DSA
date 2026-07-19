class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length)
            return intersection(arr2, arr1);
        Set<Integer> st = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for (int ele : arr1) {
            st.add(ele);
        }

        for (int ele : arr2) {
            if (st.contains(ele)) {
                ans.add(ele);
                st.remove(ele);
            }
        }
        int[] an = new int[ans.size()];
        int i = 0;
        for (int ele : ans) {
            an[i++] = ele;
        }
        return an;
    }
}