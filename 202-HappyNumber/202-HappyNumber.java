// Last updated: 03/08/2026, 21:16:06
class Solution {
    public boolean isHappy(int n) {
        while(n != 1 && n!=4)
        {
            int sum = 0;
            int temp = n;
            while(temp > 0)
            {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            n = sum;
            
        }
        return n==1;
    }
}