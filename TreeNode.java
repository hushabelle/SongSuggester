public class TreeNode{
  String value;
  TreeNode left;
  TreeNode right;

  public TreeNode(String value){
    this.value = value;
    this.left = null;
    this.right = null;
  }

  public TreeNode (String value, TreeNode left, TreeNode right){
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public TreeNode getLeft(){
    return left;
  }

  public TreeNode getRight(){
    return right;
  }

  public boolean isLeaf(){
    if (this == null) {
      return false;
    }
    if (this.getLeft() == null && this.getRight() == null){
      return true;
    }
    return false;
  }
}
