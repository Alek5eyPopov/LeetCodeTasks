package Task5;

public class Solution5 {
    public String longestPalindrome(String s) {
        String result = null;
        for (int i = 0; i < s.length(); i++) {
            String pol = findMax(s, i);
            if (result == null || result.length() < pol.length()) {
                result = pol;
            }
        }
        return result;
    }


    public String findMax(String s, int pos) {
        String res = s.charAt(pos) + "";
        char firstSymbol = s.charAt(pos);
        boolean leftStop = false;
        boolean rightStop = false;

        int left = pos - 1;
        int right = pos + 1;

        while (true) {

            if (!leftStop && left >= 0 && firstSymbol == s.charAt(left)) {
                res = firstSymbol + res;
                left -= 1;
            } else {
                leftStop = true;
            }

            if (!rightStop && right < s.length() && firstSymbol == s.charAt(right)) {
                res = res + firstSymbol;
                right += 1;
            } else {
                rightStop = true;
            }

            if (leftStop && rightStop) {
                break;
            }
        }


        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                res = s.substring(left, right + 1);
                left -= 1;
                right += 1;
            } else {
                break;
            }
        }

        return res;
    }
}
