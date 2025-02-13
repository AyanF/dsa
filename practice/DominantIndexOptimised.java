public class DominantIndexOptimised {
    public static void main(String[] args) {
        runTests();
    }

    public static int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // Edge case: Empty or null array
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int res = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
                res = i;
            } else if (nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        if (largest >= (secondLargest * 2)) {
            return res;
        }
        return -1;
    }

    private static void runTests() {
        int[][] testCases = {
            {3, 6, 1, 0},    // Expected: 1 (6 is at least twice of others)
            {1, 2, 3, 4},    // Expected: -1 (No dominant element)
            {0, 0, 3, 2},    // Expected: 2 (3 is at least twice of others)
            {1},             // Expected: 0 (Only one element)
            {1, 0},          // Expected: 0 (1 is at least twice of 0)
            {0, 0, 0, 0},    // Expected: 0 (First element as all are equal)
            {10, 5, 2, 1},   // Expected: 0 (10 is at least twice of others)
            {-1, -2, -3},    // Expected: -1 (Negative numbers, no dominant)
            {5, 5, 5, 5},    // Expected: -1 (No dominant element)
            {},              // Expected: -1 (Empty array)
            {Integer.MAX_VALUE, 1, 2, 3}  // Expected: 0 (Max int value dominates)
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = dominantIndex(testCases[i]);
            System.out.println("Test Case " + (i + 1) + ": " + result);
        }
    }
}

