//import java.util.ArrayList;
//import java.lang.StringBuffer;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Stack;
//public class Solution {
//    public ArrayList<Integer> printListFromTailToHead(List listNode) {
//        Stack<Integer> s=new Stack();
//
//        while(listNode.next!=null){
//            s.push(listNode.val);
//            listNode=listNode.next;
//        }
//        ArrayList<Integer> a=new ArrayList();
//        while(!s.isEmpty()){
//            a.add(s.pop());
//        }
//        return a;
//
//    }
//}