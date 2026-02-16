// class Solution {

//     public int minDays(int[] bloomDay, int m, int k) {

//         int n = bloomDay.length;

//         // Not enough flowers
//         if ((long)m * k > n) {
//             return -1;
//         }

//         int minDay = Integer.MAX_VALUE;
//         int maxDay = Integer.MIN_VALUE;

//         // Find min and max bloom day
//         for (int i = 0; i < n; i++) {
//             minDay = Math.min(minDay, bloomDay[i]);
//             maxDay = Math.max(maxDay, bloomDay[i]);
//         }

//         // Try every day from minDay to maxDay
//         for (int day = minDay; day <= maxDay; day++) {

//             int count = 0;      // consecutive flowers
//             int bouquets = 0;   // number of bouquets

//             for (int i = 0; i < n; i++) {

//                 if (bloomDay[i] <= day) {
//                     count++;
//                 } else {
//                     bouquets += count / k;
//                     count = 0;
//                 }
//             }

//             // Add remaining flowers
//             bouquets += count / k;

//             if (bouquets >= m) {
//                 return day;
//             }
//         }

//         return -1;
//     }
// }



class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // If not enough flowers
        if ((long) m * k > n) {
            return -1;
        }

        // Find min and max bloom day using simple for loop
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }
            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        // Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int count = 0;      // consecutive flowers
            int bouquets = 0;   // number of bouquets formed

            // Check if possible in 'mid' days
            for (int i = 0; i < n; i++) {

                if (bloomDay[i] <= mid) {
                    count++;
                } else {
                    bouquets += count / k;
                    count = 0;
                }
            }

            bouquets += count / k;  // last segment

            if (bouquets >= m) {
                high = mid - 1;   // try smaller day
            } else {
                low = mid + 1;    // need more days
            }
        }

        return low;
    }
}
