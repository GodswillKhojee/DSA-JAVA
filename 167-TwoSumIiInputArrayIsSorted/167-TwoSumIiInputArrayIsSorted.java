// Last updated: 03/08/2026, 21:16:16
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(i <= j)
        {
            if(numbers[i] + numbers[j] == target) return new int [] {i+1,j+1};
            else if(numbers[i] + numbers[j] > target) j--;
            else  if (numbers[i] + numbers[j] < target) i++;
            
        }
        int [] ar = {-1,-1};
        return ar;
    }
}