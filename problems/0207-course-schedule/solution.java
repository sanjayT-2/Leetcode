class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> [] graph = new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++){
            graph[i] = new ArrayList<>();
        }

        int [] inDeg = new int[numCourses];
        for(int []edge :prerequisites){
            int from = edge[1];
            int to = edge[0];
            graph[from].add(to);
            inDeg[to]++;
        }

         int  count = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(inDeg[i] == 0){
                q.offer(i);
            }
        }

            while(!q.isEmpty()){
                int curr = q.poll();
                 count++;
                for(int parosi : graph[curr]){
                    inDeg[parosi]--;

                    if(inDeg[parosi] == 0){
                        q.offer(parosi);
                    }
                }
            }
        

        return  count == numCourses;
    }
}
