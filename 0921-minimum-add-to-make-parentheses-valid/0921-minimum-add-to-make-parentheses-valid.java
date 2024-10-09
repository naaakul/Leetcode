class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Boolean> boo = new Stack<>();

        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch == '(') boo.push(true);
            else if(ch == ')' && boo.empty())ans++;
            else boo.pop();
        }

        return ans + boo.size();
    }
}