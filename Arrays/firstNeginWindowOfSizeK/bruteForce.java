package Arrays.firstNeginWindowOfSizeK;

import java.util.*;

public class bruteForce {
    static List<Integer> firstNegInt(int arr[], int k) {
        // code here
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i < n-k+1;i++)
        {
            boolean found = false;
            for(int j = i; j < i+k; j++)
            {
                if(arr[j] < 0)
                {
                    ans.add(arr[j]);
                    found = true;
                    break;
                }

            }
            if(!found) ans.add(0);

        }
        return ans;
    }
}
