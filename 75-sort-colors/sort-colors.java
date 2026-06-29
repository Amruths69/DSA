class Solution {
    public void sortColors(int[] nums) {
    int[] arr=new int[nums.length];
    int z=0;
        int o=0;
        int t=0;
    for(int i=0;i<nums.length;i++){
        
        if(nums[i]==0){
            z++;
        }else if(nums[i]==1){
            o++;
        }else{
            t++;
        }
        


    
    
    
    }
    int in=0;
    while(z-->0){
            nums[in++]=0;
        }
        while(o-->0){
            nums[in++]=1;
        }
        while(t-->0){
            nums[in++]=2;
        }
    }
}