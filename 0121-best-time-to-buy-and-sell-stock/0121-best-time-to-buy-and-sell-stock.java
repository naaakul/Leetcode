class Solution {
    public int maxProfit(int[] pri) {
        int min = pri[0], pro = 0;

        for(int i = 0; i < pri.length; i++){
            pro = Math.max(pro, pri[i] - min);
            min = Math.min(min, pri[i]);
        }

        return pro;
    }
}