// Last updated: 03/08/2026, 21:13:26
class Solution {
    public int alternateDigitSum(int n) {
       
        int sum = 0;
        int count = 0;
        int temp = n;
        while(temp > 0)
        {
            count++;
            temp/=10;
        }
        boolean isSwitch = (count%2==1);
        while(n>0)
        {
            int digit = n%10;
            
            if(isSwitch)
            {
                sum += digit;
                isSwitch = false;
            }    
            else 
            {
                sum -= digit;
                isSwitch = true;
            }    
            n/=10;

        }
        return sum;
    }
}