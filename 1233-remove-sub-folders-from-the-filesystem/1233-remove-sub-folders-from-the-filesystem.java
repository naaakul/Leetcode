class Solution {
    public List<String> removeSubfolders(String[] f) {
        Arrays.sort(f);

        List<String> ans = new ArrayList<>();
        ans.add(f[0]);

        for(int i = 1; i < f.length; i++){
            if(!f[i].startsWith(ans.get(ans.size() - 1) + "/"))ans.add(f[i]);
        }

        return ans;
    }
}