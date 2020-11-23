package tree;


import tree.iml.BinaryTree;

import java.util.Stack;

public class Main {
    public static void main(String args[]){
//       TreeNode head=null;
//   Tree t=new Tree();
//   int a[]={6,4,10,6,1,8,5,9,13,123};
//     for(int i=0;i<100;i++){
//         head=t.insertAnyTreeNode(head,i);
//     }
//     t.print(head);
        TreeNode n3=new TreeNode(5,null,null);
        TreeNode n7=new TreeNode(7,null,null);
        TreeNode n6=new TreeNode(6,null,n7);
        TreeNode n5=new TreeNode(3,null,null);
        TreeNode n4=new TreeNode(2,n5,n6);
        TreeNode n2=new TreeNode(4,null,n3);
        TreeNode n1=new TreeNode(1,n2,n4);
        BinaryTree binaryTree=new BinaryTree(n1);
       // binaryTree.postOrderTraverse();
        binaryTree.inOrderTraverse();

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
