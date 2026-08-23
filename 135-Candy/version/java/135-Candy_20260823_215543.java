// Last updated: 23/08/2026, 21:55:43
/*
 * used two arraylist left and right traverse 
 * which will tell the max candy distribution among the kids
*/

class Solution {
    public void processLeft(int [] ratings, ArrayList<Integer>left)
    {
        int ad = 1;
        left.add(ad);
        for(int i = 1; i < ratings.length;i++)
        {
            if(ratings[i] > ratings[i-1])
            {
                ad+=1;
                left.add(ad);
            } 
            else
            {
                ad=1;
                left.add(ad);
            }
        }
    }
    public void processRight(int []ratings, ArrayList<Integer>right)
    {
        int ad = 1;
        right.add(ad);
        for(int i = ratings.length-2; i>=0;i--)
        {
            if(ratings[i] > ratings[i+1])ad+=1;
            else ad = 1;
            right.add(ad);
        }
        Collections.reverse(right);
    }
    public int candy(int[] ratings) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        processLeft(ratings, left);
        processRight(ratings,right);
        int sum = 0;
        for(int i = 0; i < ratings.length;i++)sum += Math.max(left.get(i),right.get(i));
        return sum;
    }
}