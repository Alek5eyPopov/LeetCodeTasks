package Task1;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int diff = 0;
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            res[0] = i;
            diff = target - nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == diff){
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}