package tree;


import java.util.Stack;

public class Main {
    public static void main(String args[]){
       TreeNode head=null;
   Tree t=new Tree();
   int a[]={6,4,10,6,1,8,5,9};
     for(int i=0;i<a.length;i++){
         head=t.insertTreeNode(head,a[i]);
     }
     t.print(head);
//        Stack<Integer> s=new Stack<>();
//        int a[]={1,2,3,4,5,6,7,8,9};
//        for(int i=0;i<a.length;i++){
//            s.push(a[i]);
//        }
//     while (!s.isEmpty()){
//            System.out.println(s.pop());
//        }

    }
}
