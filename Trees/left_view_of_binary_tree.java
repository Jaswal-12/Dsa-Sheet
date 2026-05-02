
class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        
        Queue<Node>q=new LinkedList<>();
        q.add(root);
    
        while(!q.isEmpty()){
            
            int s=q.size();
            for(int i=0;i<s;i++){
                Node node=q.poll();
                
                if(i==0){
                    ans.add(node.data);
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
