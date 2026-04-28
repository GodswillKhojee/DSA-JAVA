package BinarySearch;

public class firstandlastOccurrance {
    public static void main(String[] args) {
        int [] nums = {2,2,3,3,5,5,5,9};
        int target = 5;
        int []arr = searchRange(nums,target);

    }
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int first = -1;
        int last = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] == target) {
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] > target) high = mid-1;
            else if(nums[mid] < target) low = mid+1;
        }
        low = 0;high = n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid] == target) {
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] > target) high = mid-1;
            else if(nums[mid] < target) low = mid+1;
        }
        return new int[] {first,last};
    }
}
