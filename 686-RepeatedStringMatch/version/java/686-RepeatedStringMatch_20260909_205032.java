// Last updated: 09/09/2026, 20:50:32
class Solution {
    public int repeatedStringMatch(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }

        String str = sb.toString();
        if (str.contains(b)) {
            return count;
        }
        
        sb.append(a);
        count++;

        str = sb.toString();
        
        if (str.contains(b)) {
            return count;
        }

        return -1;
    }
}