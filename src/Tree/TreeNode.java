package Tree;

public class TreeNode<T> {
    private TreeNode Left;
    private T data;
    private TreeNode Right;

    public TreeNode() {
    }
    public TreeNode(T obj){
        this.data=obj;

    }

    public TreeNode(TreeNode left, T data, TreeNode right) {
        Left = left;
        this.data = data;
        Right = right;
    }

    public TreeNode getLeft() {
        return Left;
    }

    public void setLeft(TreeNode left) {
        Left = left;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getRight() {
        return Right;
    }

    public void setRight(TreeNode right) {
        Right = right;
    }
}
