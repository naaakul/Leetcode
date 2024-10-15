class Solution {
    public long minimumSteps(String s) {
        int zero = 0;
        for(char c : s.toCharArray()){
            if(c == '0')zero++;
        }

        long ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0')zero--;
            else ans += zero;
        }

        return ans;
    }
}