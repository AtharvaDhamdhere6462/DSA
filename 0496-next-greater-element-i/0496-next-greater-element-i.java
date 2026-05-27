class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++) {

            int index = -1;

            // find nums1 element inside nums2
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }

            // search greater element on right side
            int nextGreater = -1;

            for (int j = index + 1; j < nums2.length; j++) {

                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            nums1[i] = nextGreater;
        }

        return nums1;
    }
}