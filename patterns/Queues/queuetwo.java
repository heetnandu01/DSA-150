// leetcode problem : https://leetcode.com/problems/implement-stack-using-queues/description/

import java.util.LinkedList;
import java.util.Queue;

class queuetwo {
        Queue <Integer> q;
    public void MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.offer(x);
        int size = q.size();
        for(int i = 0;i< size - 1;i++){
            q.offer(q.poll());
        } 
    }  
    public int pop() {
        return q.poll();   
    }
    public int top() {
        return q.peek();   
    }
    public boolean empty() {
        return q.isEmpty();
    }
}