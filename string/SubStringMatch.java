class SubStringMatch {
    public int strStr(String haystack, String needle) {
        
        int haystackL = haystack.length();
        int needleL = needle.length();

        if (needleL > haystackL) return -1; 
        
        for(int i=0; i<=haystackL-needleL; i++){
            
            int j=0;
            
            while(j<needle.length() && haystack.charAt(i + j) == needle.charAt(j)){
                
                j++;
            }
            
            if(j==needleL){
                return i;
            }
        }
        return -1;
        
    }
    
}
