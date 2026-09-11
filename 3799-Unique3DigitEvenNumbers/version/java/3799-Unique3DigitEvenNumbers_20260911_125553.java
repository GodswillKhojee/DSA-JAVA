// Last updated: 11/09/2026, 12:55:53
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < digits.length;i++)
        {
            if(digits[i] == 0) continue;
            for(int j = 0; j < digits.length;j++)
            {
                if(j == i) continue;
                for(int a = 0; a<digits.length;a++)
                {
                    if(a == i || a == j) continue;
                    if(digits[a] % 2 != 0) continue;

                    int num = digits[i] * 100
                            + digits[j] * 10
                            + digits[a];

                    set.add(num);
                }
            }
        }
        return set.size();
    }
}