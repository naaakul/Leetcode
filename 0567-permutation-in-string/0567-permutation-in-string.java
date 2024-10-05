class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())return false;

        int[] ch1 = new int[26];

        for (char s : s1.toCharArray()) {
            ch1[s - 97]++;
        }

        int[] ch2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            ch2[s2.charAt(i) - 97]++;
        }

        int i = 0;
        int j = s1.length() - 1;

        while(j < s2.length()){
            if(Arrays.equals(ch1, ch2)) return true;
            if(j + 1 < s2.length())ch2[s2.charAt(++j) - 97]++;
            else j++;
            ch2[s2.charAt(i++) - 97]--;
        }

        return false;
    }
}