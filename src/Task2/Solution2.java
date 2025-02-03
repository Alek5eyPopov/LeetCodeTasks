package Task2;

import java.math.BigInteger;

public class Solution2 {
    private final StringBuffer sb = new StringBuffer();
    private final BigInteger ten = new BigInteger("10");
    private final BigInteger zero = new BigInteger("0");

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        sb.setLength(0);
        BigInteger lng1 = toNum(l1);
        sb.setLength(0);
        BigInteger lng2 = toNum(l2);
        return toList(lng1.add(lng2));
    }

    private BigInteger toNum(ListNode l) {
        sb.insert(0, l.val);
        if (l.next == null)
            return new BigInteger(sb.toString());
        return toNum(l.next);
    }

    private ListNode toList(BigInteger num) {
        BigInteger ost;
        ListNode l;
        ost = num.mod(ten);
        l = new ListNode(ost.intValue(), null);
        num = num.divideAndRemainder(ten)[0];
        if (num.compareTo(zero) > 0) {
            l.next = toList(num);
        }
        return l;
    }
}
