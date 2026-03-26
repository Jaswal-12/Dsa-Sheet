class Solution {
    public int compress(char[] arr) {

        int index = 0; // ans ki jagah write pointer
        int count = 1;

        for(int i = 0; i < arr.length; i++){

            if(i + 1 < arr.length && arr[i] == arr[i + 1]){
                count++;
            } 
            else{
                // jo tu ans = ans + arr[i] karta tha
                arr[index++] = arr[i];

                // jo tu ans = ans + count karta tha
                if(count > 1){
                    String cnt = String.valueOf(count);
                    for(int k = 0; k < cnt.length(); k++){
                        arr[index++] = cnt.charAt(k);
                    }
                }

                count = 1;
            }
        }

        return index;
    }
}
