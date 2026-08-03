// Last updated: 04/08/2026, 00:21:37
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        int size = nums.size();
        
        for(int i = 0; i < size - 1; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return {i,j};
                }

            }
           
        }
        return {-1,-1};
    }
};