/** 
 * Forward declaration of guess API.
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int st = 1;
        int end = n;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            int res = guess(mid);

            if (res == 0) {
                return mid;
            } else if (res == -1) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return -1;
    }
}