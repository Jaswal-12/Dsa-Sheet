class Solution {
    public int maxLevelSum(TreeNode root) {

        int level_ans=1;
        int level=1;

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int prev_sum=Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int s=q.size();
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode node=q.poll();
                sum=sum+node.val;

                if(node.left!=null){
                    q.add(node.left);
                }

                if(node.right!=null){
                    q.add(node.right);
                }

            }

            if(sum>prev_sum){
                prev_sum=sum;
                level_ans=level;
            }
            level++;
        }


        return level_ans;
        
    }
}
