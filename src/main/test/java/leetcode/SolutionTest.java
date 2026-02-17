package leetcode;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void SolutionTest() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        int[] expected = {1,3,6,10};
        int[] result = solution.runningSum(nums);
        assert(java.util.Arrays.equals(expected, result));
    }
}
