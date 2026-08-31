// Last updated: 31/08/2026, 20:47:10
class Solution {
    public boolean repeatedSubstringPattern(String s) {

        String mayRepeat = "";

        char first = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == first) {
                mayRepeat = s.substring(0, i);

                if (s.length() % mayRepeat.length() != 0) {
                    continue;
                }

                boolean valid = true;

                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != mayRepeat.charAt(j % mayRepeat.length())) {
                        valid = false;
                        break;
                    }
                }

                if (valid) {
                    return true;
                }
            }
        }

        return false;
    }
}