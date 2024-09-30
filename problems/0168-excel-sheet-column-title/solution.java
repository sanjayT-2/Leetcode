class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ch = new StringBuilder();
        while(columnNumber-->0)
        {
         ch.append((char)(columnNumber%26+'A'));
         columnNumber/=26;
         
        }
        return ch.reverse().toString();
    }
}
