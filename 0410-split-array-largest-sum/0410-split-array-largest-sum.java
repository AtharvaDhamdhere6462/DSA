class Solution {

    public int splitArray(int[] nums, int k) {
        return findPages(nums, k);
    }

    public int countStudents(int[] nums, int pages) {
        int students = 1;
        long pageStudent = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pageStudent + nums[i] <= pages) {
                pageStudent += nums[i];
            } else {
                students++;
                pageStudent = nums[i];
            }
        }

        return students;
    }

    public int findPages(int[] arr, int m) {
        int n = arr.length;

        int low = arr[0];
        int high = 0;

        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int students = countStudents(arr, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}