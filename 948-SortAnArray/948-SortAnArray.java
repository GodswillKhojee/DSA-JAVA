// Last updated: 03/08/2026, 21:14:27
import java.util.Random;

class Solution {
    Random rand = new Random();

    public int[] sortArray(int[] nums) {
        qs(nums, 0, nums.length - 1);
        return nums;
    }

    public void qs(int[] nums, int low, int high) {
        if (low < high) {
            int pIndex = partition(nums, low, high);
            qs(nums, low, pIndex - 1);
            qs(nums, pIndex + 1, high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        // Random pivot
        int pivotIndex = low + rand.nextInt(high - low + 1);
        swap(nums, low, pivotIndex);

        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && nums[i] <= pivot) i++;
            while (j >= low + 1 && nums[j] > pivot) j--;

            if (i < j) swap(nums, i, j);
        }

        swap(nums, low, j);
        return j;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}