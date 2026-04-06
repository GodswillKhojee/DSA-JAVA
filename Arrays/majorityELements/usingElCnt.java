package Arrays.majorityELements;

public class usingElCnt {
    public static int majority(int [] nums)
    {
        int n = nums.length;
        int cnt = 0;
        int el = nums[0];
        for (int i = 0; i < n; i++)
        {
            if (cnt == 0)
            {
                cnt = 1;
                el = nums[i];
            }
            else if (el == nums[i])cnt++;
            else cnt--;
        }
        int cnt1 = 0;
        for(int ele : nums)
        {
            if(el == ele) cnt1++;
        }

        if(cnt1 > (n/2)) return el;

        return cnt;

    }
    public static void main(String[] args) {
        int [] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        System.out.println(majority(nums));
    }
}
