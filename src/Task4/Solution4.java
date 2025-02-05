package Task4;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        } else if (nums1.length == 0) {
            return oneMassResult(nums2);
        } else if (nums2.length == 0) {
            return oneMassResult(nums1);
        } else {
            return twoMassResult(nums1, nums2);
        }
    }

    public double oneMassResult(int[] nums) {
        int pos = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (double) (nums[pos] + nums[pos - 1]) / 2;
        } else {
            return nums[pos];
        }
    }

    public double twoMassResult(int[] nums1, int[] nums2) {
        int count = 0;
        int i = 0;
        int j = 0;
        int a = 0;
        int b;
        int curr1 = 0;
        int curr2 = 0;
        boolean firstEnd = false;
        boolean secondEnd = false;

        int len = nums1.length + nums2.length;
        int pos = len / 2;
        int ost = len % 2;

        while (true) {
            if (i < nums1.length) {
                curr1 = nums1[i];
            } else {
                firstEnd = true;
            }

            if (j < nums2.length) {
                curr2 = nums2[j];
            } else {
                secondEnd = true;
            }

            b = a;

            if (firstEnd) {
                a = curr2;
                j++;
            } else if (secondEnd) {
                a = curr1;
                i++;
            } else {
                if (curr1 >= curr2) {
                    a = curr2;
                    j++;
                } else {
                    a = curr1;
                    i++;
                }
            }

            if (count == pos) {
                if (ost == 0) {
                    return (double)(a + b) / 2;
                } else {
                    return a;
                }
            }
            count++;
        }

    }
}
