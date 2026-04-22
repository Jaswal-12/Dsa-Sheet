class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
            
            List<String>ans=new ArrayList<>();


            for(int i=0;i<q.length;i++){
                for(int j=0;j<d.length;j++){
                    if(q[i].length()==d[j].length()){
                        int diff=0;
                        for(int k=0;k<q[i].length();k++){
                            if(q[i].charAt(k)!=d[j].charAt(k)){
                                diff++;
                                if(diff>2){
                                    break;
                                }
                            }
                        }

                        if(diff<=2){
                            ans.add(q[i]);
                            break;
                        }
                    }

                }
            }

            return ans;
            
    }
}
