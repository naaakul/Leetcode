public class Solution {
    public char findKthBit(int n, int k) {
        return findKthBitHelper(n, k);
    }

    private char findKthBitHelper(int n, int k) {
        if (n == 1) {
            return '0';
        }

        int length = (1 << n) - 1; 
        if (k == (length / 2) + 1) {
            return '1';
        }

        if (k < (length / 2) + 1) {
            return findKthBitHelper(n - 1, k);
        }

        int mirroredIndex = length - k + 1;

        return invert(findKthBitHelper(n - 1, mirroredIndex));
    }

    private char invert(char bit) {
        return bit == '0' ? '1' : '0';
    }
}
