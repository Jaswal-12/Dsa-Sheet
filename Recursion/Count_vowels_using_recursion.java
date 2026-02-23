class Main {
    
    public static int countvowels(String str,int idx){
        
         if(idx == str.length()){
             return 0;
         }
         
         if(str.charAt(idx)=='a' || str.charAt(idx)=='i' || 
            str.charAt(idx)=='e' || str.charAt(idx)=='o' || 
            str.charAt(idx)=='u')
             
             return 1 + countvowels(str,idx+1);
         
         return countvowels(str,idx+1);
    }
    
    public static void main(String[] args) {
        
        String str="karan";
        System.out.println(countvowels(str,0));
    }
}
