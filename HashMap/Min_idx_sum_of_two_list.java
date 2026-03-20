class Solution {
    public String[] findRestaurant(String[] l1, String[] l2) {

        ArrayList<Integer> li = new ArrayList<>();
        ArrayList<String> ls = new ArrayList<>();

        for(int i = 0; i < l1.length; i++){
            for(int j = 0; j < l2.length; j++){
                if(l1[i].equals(l2[j])){
                    int sum = i + j;
                    ls.add(l1[i]);
                    li.add(sum);
                }
            }
        }

        // find minimum sum
        int min = Integer.MAX_VALUE;
        for(int x : li){
            min = Math.min(min, x);
        }

        // collect result
        ArrayList<String> ansList = new ArrayList<>();
        for(int i = 0; i < li.size(); i++){
            if(li.get(i) == min){
                ansList.add(ls.get(i));
            }
        }

        return ansList.toArray(new String[0]);
    }
}
