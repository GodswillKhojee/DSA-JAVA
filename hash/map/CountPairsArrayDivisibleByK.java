package hash.map;

import java.util.HashMap;

public class CountPairsArrayDivisibleByK {

    public static int countKdivPairs(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of remainders
        for (int ele : arr) {
            int rem = ((ele % k) + k) % k;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        long pairs = 0;

        // Pairs with remainder 0
        long zeroCount = map.getOrDefault(0, 0);
        pairs += zeroCount * (zeroCount - 1) / 2;
        map.remove(0);

        // Pairs with remainder k/2 (if k is even)
        if (k % 2 == 0) {
            long halfCount = map.getOrDefault(k / 2, 0);
            pairs += halfCount * (halfCount - 1) / 2;
            map.remove(k / 2);
        }

        // Complementary remainder pairs
        pairs *= 2;
        for (int key : map.keySet()) {
            int rem = k - key;
            if (map.containsKey(rem)) {
                pairs += 1L * map.get(key) * map.get(rem);
            }
        }
        pairs /= 2;

        return (int) pairs;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 7, 5, 3};
        int k = 4;

        System.out.println(countKdivPairs(arr, k));
    }
}