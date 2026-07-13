class Solution {
	void segregate0and1(int[] arr) {
		int i = 0;
		int j = 0;
		while (j<arr.length) {
			if (arr[j] != 1) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
			j++;
		}
	}
}
