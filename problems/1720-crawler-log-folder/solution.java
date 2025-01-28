class Solution {
    public int minOperations(String[] logs) {
        // Stack<String> s = new Stack<String>();
        // for (String a : logs) {

        //     if (a.equals("./")) {
        //         continue;
        //     } else if (a.equals("../")) {
        //         if (!s.isEmpty()) {
        //             s.pop();
        //         }

        //     }

        //     else {
        //         s.push(a);

        //     }
        // }

        // return s.size();
        
        int c=0;
        for(String i:logs){
            if(i.equals("./")) continue;
            else if(i.equals("../") && c>0) c--;
            else if(!i.equals("../")) c++;
        }
        return c;
    }
}
