public class SquareRoot {
     public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        long left = 1;
        long right = x;
        int ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid <= x) {
                ans = (int) mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Main function
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);

        System.out.println("Square root of " + x + " is: " + result);
    }
}