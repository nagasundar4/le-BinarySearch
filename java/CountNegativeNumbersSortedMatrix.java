class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int cols = grid[0].length;

        for (int[] row : grid) {
            int left = 0;
            int right = cols - 1;
            int firstNegativeIndex = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (row[mid] < 0) {
                    firstNegativeIndex = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (firstNegativeIndex != -1) {
                count += cols - firstNegativeIndex;
            }
        }

        return count;
    }
}