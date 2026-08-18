// Last updated: 18/08/2026, 16:40:57
// This code determines whether a lemonade stand can give the correct change to every customer. It keeps track of the number of $5 bills using `five` and the number of $10 bills using `ten`. When a customer pays with $5, no change is needed, so the count of five-dollar bills is increased. When a customer pays with $10, the seller needs to give back $5, so the code checks whether at least one $5 bill is available; if so, it uses one $5 bill and stores the $10 bill. When a customer pays with $20, the seller needs to return $15. The code first tries to give one $10 bill and one $5 bill because this preserves more $5 bills for future customers. If that is not possible, it checks whether there are at least three $5 bills and gives three of them as change. If neither option is possible, the function returns `false` because the seller cannot provide the required change. If every customer is successfully served, the function returns `true`.
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int ele : bills)
        {
            if(ele == 5) five++;
            else if(ele == 10) 
            {
                if(five > 0) 
                {
                    five--;
                    ten++;
                }
                else return false;
            }
            else
            {
                if(five >0 && ten>0)
                {
                    ten--;
                    five--;
                }
                else if(five >= 3)
                {
                    five-=3;
                }
                else return false;
            }
        }
        return true;
    }
}