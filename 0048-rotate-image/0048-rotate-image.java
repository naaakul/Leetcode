class Solution {
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void rotate(int[][] mat) {
        int n = mat.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int fake = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = fake;
            }
        }

        for(int i = 0; i < n; i++){
            reverseArray(mat[i]);
        }
    }
}