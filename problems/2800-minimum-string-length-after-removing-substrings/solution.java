class Solution {
    public int minLength(String s) {
        
        Stack st = new Stack();
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && (((char)st.peek()=='A' && ch=='B') || ((char)st.peek()=='C' && ch=='D' )))
            
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        return st.size();
    }
}
