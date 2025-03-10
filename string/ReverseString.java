class ReverseString {
    public void reverseString(char[] s) {
        
        int j= s.length-1;
        int i=0;
        
        while(i<j){
            
            char tmp1 = s[i];
            s[i]=s[j];
            s[j]=tmp1;
            
            i++;
            j--;
            
        }
        
    }
}
