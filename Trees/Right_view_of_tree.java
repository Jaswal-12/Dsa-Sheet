
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
      List<Integer>ans=new ArrayList<>();
      
      if(root==null) return ans;

      Queue<TreeNode>q=new LinkedList<>();
      q.add(root);


      while(!q.isEmpty()){
         int s=q.size();

         for(int i=0;i<s;i++){
            TreeNode node=q.poll();
            if(i==s-1){
                ans.add(node.val);
            }

            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }
         }
      }

      return ans;

    }
}

