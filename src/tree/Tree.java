package tree;

public  class Tree {
   // TreeNode head=null;
//    public  TreeNode createTree(int d){
//        TreeNode t=new TreeNode(d);
//        head=t;
//        return head;
//    }
    public TreeNode insertTreeNode(TreeNode head,int d){
        if(head==null) {
            head=new TreeNode(d);
            return head;
        }

        if(d<head.val){
            head.left=insertTreeNode(head.left,d);
        }
        else if (head.val<d){
            head.right=insertTreeNode(head.right,d);
        }

          return   head;
    }
    public void print(TreeNode h){
       if(h!=null){
            System.out.println(h.val);
            if(h.left!=null) print(h.left);
            if(h.right!=null) print(h.right);
        }
    }

}
