
import java.util.PriorityQueue;
import java.util.Collections;
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            q.offer(stone);
        }
        while(q.size()>1){
            int y=q.poll();
            int x=q.poll();
            if(y!=x){
                q.offer(y-x);
            }
        }
        if(q.isEmpty()){
            return 0;
        }
        else{
            return q.peek();
        }
    }
    public static void main(String[]args){
        int[]stones={2,7,4,1,8,1};
        Solution obj = new Solution();
        obj.lastStoneWeight(stones);
    }
}