class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        if(arr1.length>arr2.length) return intersection(arr2,arr1);
        int n1 = arr1.length , n2 = arr2.length;
        Set<Integer> st = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for(int ele : arr1){
            st.add(ele);
        }
        
        for(int i=0;i<n2;i++){
            if(st.contains(arr2[i])){
                ans.add(arr2[i]);
                st.remove(arr2[i]);
            }
        }
        int[] an = new int[ans.size()];
        int i = 0;
        for(int ele : ans){
            an[i++] = ele;
        }
        return an;
    }
}