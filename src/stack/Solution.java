package stack;

import java.util.Stack;

public class Solution {
    public boolean isPopOrder(int [] pushA,int [] popA) {
        int len = pushA.length;
        java.util.Stack<Integer> s = new Stack<Integer>();

        for(int i=0, j=0;  i < len; i++){
            s.push(pushA[i]);
            while(j < len && s.peek() == popA[j]){
                s.pop();
                j = j+1;
            }
        }
        return s.empty();
    }
}
