package tree.interf;

import tree.TreeNode;

public interface BinaryTree {
    public boolean isEmpty();//判断是否为空
    public int size();//获取长度
    public int getHeight();//获取长度
    public TreeNode findKey(Object value);
    public void preOrderTraverse();//先序
    public void inOrderTraverse();//中序
    public void postOrderTraverse();//后序
    public void postOrderTraverse(TreeNode treeNode);//后序,非递归
    public void preOrderByStack();//先序，非递归
    public void inOrderByStack();//中序,非递归
    public void postOrderByStack();//后序，非递归
    public void levelOrderByStack();//层次遍历


}
