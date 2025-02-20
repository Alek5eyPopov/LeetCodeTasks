package Task6;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public String convert(String s, int numRows) {
        List<Character> str = new ArrayList<>();
        int pos;
        int count = 0;

        if (numRows == 1){ return s;}
        for (int i = 1; i <= numRows; i++) {
            if (i == 1) {
                while (count < s.length()) {
                    pos = count;
                    str.add(s.charAt(pos));
                    count += 2 * (numRows - 1);
                }
            } else if (i == numRows) {
                count = numRows - 1;
                while (count < s.length()) {
                    pos = count;
                    str.add(s.charAt(pos));
                    count += 2 * (numRows - 1);
                }
            } else {
                count = i - 1;
                while (count < s.length()) {
                    pos = count;
                    str.add(s.charAt(pos));

                    pos = pos + 2 * (numRows - i);
                    if (pos >= s.length()) {
                        break;
                    }
                    str.add(s.charAt(pos));

                    count += 2 * (numRows - 1);
                }

            }

        }

        StringBuilder sb = new StringBuilder();
        for (Character c : str) {
            sb.append(c);
        }
        return sb.toString();
    }
}
