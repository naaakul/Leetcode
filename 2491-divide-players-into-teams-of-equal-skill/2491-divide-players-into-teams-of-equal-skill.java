class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);

        long ans = (skill[0] * skill[skill.length-1]);

        for(int i = 1; i < skill.length/2; i++){
            System.out.println(ans);
            ans += (skill[i] * skill[skill.length-1-i]);
            if(skill[0] + skill[skill.length-1] != skill[i] + skill[skill.length - 1 - i]) return -1;
        }

        return ans;
    }
}