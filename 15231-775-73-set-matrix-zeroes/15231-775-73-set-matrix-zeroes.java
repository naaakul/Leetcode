class Solution {
    public void setZeroes(int[][] mat) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == 0){
                    for (int k = 0; k < mat[0].length; k++) {
                        if(mat[i][k] == 0) list.add(k);
                        else mat[i][k] = 0;
                    }
                    break;
                }
            }
        }

        for(int n : list){
            for (int i = 0; i < mat.length; i++) {
                mat[i][n] = 0;
            }
        }
    }
}