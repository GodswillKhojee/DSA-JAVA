package hash.set;

import java.util.HashSet;

public class TwoSumReturnBoolean {
    public static void main(String[] args) {
        int [] arr = {2,3,1,5,3};
        int target = 7;
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr)
        {
            int rem = target - ele;
            if(set.contains(rem))
            {
                System.out.println("true");
                return;
            }
            set.add(ele);
        }
        System.out.println("false");
        return;
    }
}
