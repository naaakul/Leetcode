class Solution {
    public void setZeroes(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        int[] r = new int[rows];
        int[] c = new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    r[i] = 1;
                    c[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (r[i] == 1 || c[j] == 1) {
                    mat[i][j] = 0;
                }
            }
        }
    }
}