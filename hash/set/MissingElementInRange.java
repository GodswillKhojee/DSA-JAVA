package hash.set;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementInRange {
    public static void main(String[] args) {
        int [] arr = {1,4,5,11,5,3,15};
        int low = 10;
        int high = 15;
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr) set.add(ele);
        for(int i = low;i<=high;i++)
        {
            if(!set.contains(i)) list.add(i);
        }
        System.out.println(list);
    }
}
