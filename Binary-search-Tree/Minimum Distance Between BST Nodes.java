
class Solution {

       int prev = -1;
    int mn = Integer.MAX_VALUE;
    
    public int minDiffInBST(TreeNode root) {
        // int mn=Integer.MAX_VALUE;

        inorder(root);
        return mn;
      
    }

    public void inorder(TreeNode root){
          if(root==null) return;
        inorder(root.left);
        if(prev!=-1){
            mn=Math.min(root.val-,mn);
        }
        prev=root.val;
        inorder(root.right);
    }
}
