package Arrays.longestConsicutiveSequence;
import java.util.*;
public class bruteForce {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        if(n==0) return 0;
        for(int i = 0; i < n-1;i++)
        {
            if(nums[i] == nums[i+1]) continue;
            if(nums[i]+1 == nums[i+1]) count++;
            else {
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
//        int [] nums = {0,3,7,2,5,8,4,6,0,1};
//        int [] nums = {1,2,6,7,8};
        int [] nums = {1,0,1,2};
        System.out.println(longestConsecutive(nums));
    }
}
