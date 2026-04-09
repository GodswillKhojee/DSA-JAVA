package Arrays.leaderArray;

import java.util.ArrayList;
import java.util.Collections;

public class solution
{
    public static ArrayList<Integer> leaders(int [] arr)
    {
        ArrayList<Integer> lead = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        lead.add(max);
        for(int i = n -2; i >= 0; i--)
        {
            if(arr[i] >= max)
            {
                lead.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(lead);
        return lead;
    }
    public static void main(String[] args) {
//        int [] nums = {53 ,32 ,9 ,55 ,64 ,59 ,65 ,90}; // 90
        int [] nums = {61 ,61 ,17};
        ArrayList<Integer> list = leaders(nums);
        System.out.print(list);
    }
}
