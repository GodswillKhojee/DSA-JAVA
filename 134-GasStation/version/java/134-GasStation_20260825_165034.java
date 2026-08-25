// Last updated: 25/08/2026, 16:50:34
/*
 * here first we check if gas is greater than cost then we will get the gas which will cover all the distance
 * then we make to varable tank and index
 * we will add tank with gas-cost
 * if tank value comes negative then reset it to zero and index will come i+1
 * then we will return index
*/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        for(int i= 0; i < gas.length ; i++)
        {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas<totalCost) return -1;

        int tank = 0;
        int index = 0;
        for(int i = 0; i < gas.length;i++)
        {
            tank +=  gas[i] - cost[i];
            if(tank<0)
            {
                tank = 0;
                index = i+1;
            }
        }
        return  index;
    }
}