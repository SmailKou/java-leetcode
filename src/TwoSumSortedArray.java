public class TwoSumSortedArray {
	public int[] twoSum(int[] numbers, int target) {

		int l = 0;
		int r = numbers.length - 1;

		while (l < r) {
			int wanted = numbers[l] + numbers [r];
			if (wanted > target) {
				r--;
			}
			else if (wanted < target) {
				l++;
			}
			else {
				return new int[] {l+1,r+1};
			}
		}
		return new int[] {};
	}
}
