// Last updated: 21/08/2026, 23:38:32
// we use cnt % 3 to skip the third iteration
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int cnt = 0;

        for(int i = cost.length-1;i>=0;i--)
        {
            cnt++;
            if(cnt%3!=0) sum+=cost[i];
        }
        return sum;
    }
}