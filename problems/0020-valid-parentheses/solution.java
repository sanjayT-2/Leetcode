class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st = new Stack();
        if(n%2!=0)
        {
            return false;
        }
        else
        {
            // String str[] = new String[n];
            // str=s.split(" ");
            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='['||s.charAt(i) =='{' || s.charAt(i) =='(')
                {
                    st.push(s.charAt(i));
                }
                else
                {
                    if(st.isEmpty()) return false;
                    char c = st.pop();
                    if(!((c=='[' && s.charAt(i)==']') || (c =='{' && s.charAt(i) =='}') || (c =='(' && s.charAt(i)==')')) )
                    {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
}
