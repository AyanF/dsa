class Solution {

            public  int dominantIndex(int[] nums) {
        
            int largest = 0;
            int res=-1;
            
            if(nums.length<2 || nums.length>50){
                return res;
            }
        

            for(int i=0; i<nums.length; i++){
                
                if(nums[i]>largest)
                {
                 largest = nums[i];
                    res=i;
                }
                
            }
            
            System.out.println("largest is :"+largest);    
                
            int fin=0;
            int tmp=-1;
            
            for(int j=0; j<nums.length; j++){
                
                if(j!=res){
                    
                    System.out.println("current num :"+nums[j]);    
                    System.out.println("current j :"+j);    
                    System.out.println("current res :"+res);    
                    
                    
                    if(nums[j]>tmp){
                        tmp=nums[j];
                    
                        if(largest>=(2*nums[j])){
                            System.out.println("largest is greater than current Num");        
                            fin=1;
                        }
                        else{
                            System.out.println("Back to zero");        
                                fin=0;
                        }
                    
                    }
                    
                }
                   
            }
        
            if(fin==0){
                System.out.println("FIn is 0");        
                return -1;            
            }
            
            else{
                System.out.println("FIn is non zero ");        
                return res;
            }
        }

}
