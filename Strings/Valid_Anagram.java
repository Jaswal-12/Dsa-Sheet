class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer>mp1=new HashMap<>();
        HashMap<Character,Integer>mp2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
            mp2.put(t.charAt(i),mp2.getOrDefault(t.charAt(i),0)+1);
        }

        return  mp1.equals(mp2);

    
    
    }
