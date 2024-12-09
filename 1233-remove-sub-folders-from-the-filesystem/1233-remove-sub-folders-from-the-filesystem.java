class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Set<String> folders = new HashSet<>(Arrays.asList(folder));
        List<String> ans = new ArrayList<>();
        
        for(String f : folders){
            ans.add(f);
            
            for(int i = 1; i < f.length(); i++){
                if(f.charAt(i) == '/' && folders.contains(f.substring(0, i))){
                    ans.remove(ans.size() - 1);
                    break;
                }
            }
        }
        
        return ans;
    }
}