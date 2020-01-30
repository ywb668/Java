package Arrays.containsDuplicate;

import java.util.Arrays;

public class demo03 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0)
            return false;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
