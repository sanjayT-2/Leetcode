class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            String current = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (current.indexOf(c) != -1) {
                    break;
                } else {
                    current += c; 
                }
            }
            if(max<current.length()){
                max = current.length();
            }
        }
        return max;
    }
}
