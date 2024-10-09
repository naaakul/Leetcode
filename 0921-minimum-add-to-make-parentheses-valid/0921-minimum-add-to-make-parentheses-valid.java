class Solution {
    public int minAddToMakeValid(String s) {
        int n = 0;

        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') n++;
            else if(ch == ')' && n == 0)ans++;
            else n--;
        }

        return ans + n;
    }
}