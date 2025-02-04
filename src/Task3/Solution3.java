package Task3;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int start = 0;
        boolean finall = false;

        Map<Character, Integer> carry = new HashMap<>();

        if (s.length() == 0) return 0;

        while (!finall) {
            for (int i = start; i < s.length(); i++) {
                if (i == s.length() - 1) {
                    finall = true;
                }
                if (carry.containsKey(s.charAt(i))) {
                    start = carry.get(s.charAt(i)) + 1;
                    if (start >= s.length()) {
                        finall = true;
                    }
                    break;
                } else {
                    carry.put(s.charAt(i), i);
                }
            }
            if (carry.size() > length) {
                length = carry.size();
            }
            carry.clear();
        }

        return length;
    }
}