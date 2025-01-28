class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<Integer>();
        for(String a : operations)
        {
            
            if(a.equals("D"))
            {
                s.push(s.peek()*2);
            }
            else if(a.equals("C"))
            {
                s.pop();
            }
            else if(a.equals("+"))
            {
                int p1=s.pop();
                int p2=s.pop();
                int sum=p1+p2;
                s.push(p2);
                s.push(p1);
                s.push(sum);
            }
            else
            {
                s.push(Integer.parseInt(a)); 
            }
        }
        int tot=0;
        while(!s.isEmpty())
        {
            tot=tot+s.peek();
            s.pop();
        }
        return tot;
    }
}
