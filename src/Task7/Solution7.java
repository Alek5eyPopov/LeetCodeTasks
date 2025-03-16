package Task7;

class Solution7 {
    public int reverse(int x) {
        int max = 147483647;
        boolean neg = false;
        char first = '*';
        int start = 0;
        if (x < 0) {
            neg = true;
            max = 147483648;
            start = 1;
        }

        StringBuffer sb = new StringBuffer("" + x);
        if (neg) {
            sb.delete(0, 1);
            sb.append("-");
        }
        sb.reverse();

        int len = sb.length();
        if (neg) len -= 1;

        if (len > 10) {
            return 0;
        } else if (len == 10) {
            first = sb.charAt(start);
            if (first < '2') {
                return Integer.parseInt(sb.toString());
            } else if (first == '2'){
                int num = Integer.parseInt(sb.toString().substring(start + 1));
                if (num <= max) {
                    return Integer.parseInt(sb.toString());
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return Integer.parseInt(sb.toString());
        }
    }
}