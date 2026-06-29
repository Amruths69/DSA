class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int original = x;
        int r = 0;

        while (x > 0) {
            int o = x % 10;
            r = r * 10 + o;
            x = x / 10;
        }

        return r == original;
    }
}