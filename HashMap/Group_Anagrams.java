class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
         HashMap<String,List<String>>mp=new HashMap<>();

         for(int i=0;i<str.length;i++){
            char arr[]=str[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            if(mp.containsKey(key)){
                mp.get(key).add(str[i]);
            }else{
                List<String>temp=new ArrayList<>();
                temp.add(str[i]);
                mp.put(key,temp);

            }
         }

         return new ArrayList<>(mp.values());
    }
}
