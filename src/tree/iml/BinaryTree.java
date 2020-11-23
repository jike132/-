package tree.iml;

import tree.TreeNode;

public class BinaryTree implements tree.interf.BinaryTree {

    private TreeNode root;

 public    BinaryTree(){
        super();
    }
  public   BinaryTree(TreeNode root){
        super();
        this.root=root;

    }
    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public TreeNode findKey(Object value) {
        return null;
    }

    @Override
    public void preOrderTraverse() {//先序遍历
        if(root!=null){
            System.out.print(root.val+" ");
            //遍历左子树
            BinaryTree binaryTree=new BinaryTree(root.left);
            binaryTree.preOrderTraverse();
            //遍历右子树
            BinaryTree rbinaryTree=new BinaryTree(root.right);
            rbinaryTree.preOrderTraverse();
        }

    }

    @Override
    public void inOrderTraverse() {//中序遍历
        if(root!=null){

            //遍历左子树
            BinaryTree binaryTree=new BinaryTree(root.left);
            binaryTree.inOrderTraverse();
            System.out.print(root.val+" ");
            //遍历右子树
            BinaryTree rbinaryTree=new BinaryTree(root.right);
            rbinaryTree.inOrderTraverse();
        }
    }

    @Override
    public void postOrderTraverse() {//后序遍历
        if(root!=null){
            //遍历左子树
            BinaryTree binaryTree=new BinaryTree(root.left);
            binaryTree.postOrderTraverse();
            //遍历右子树
            BinaryTree rbinaryTree=new BinaryTree(root.right);
            rbinaryTree.postOrderTraverse();
            System.out.print(root.val+" ");
        }
    }

    @Override
    public void postOrderTraverse(TreeNode treeNode) {

    }

    @Override
    public void preOrderByStack() {

    }

    @Override
    public void inOrderByStack() {

    }

    @Override
    public void postOrderByStack() {

    }

    @Override
    public void levelOrderByStack() {

    }
}
