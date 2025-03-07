class Solution {
    public int[] productExceptSelf(int[] nums) {

    int n = nums.length;
    int[] answer = new int[n];

    int prefix[]=new int[n];
    int postfix[]=new int[n];

    prefix[0]=1;
    for(int i=1;i<n;i++) {
        prefix[i]=prefix[i-1]*nums[i-1];
    } 

    postfix[n-1]=1;
    for(int i=n-2;i>=0;i--) {
        postfix[i]=postfix[i+1]*nums[i+1];
    } 

    for(int i=0;i<n;i++) {
        answer[i]=prefix[i]*postfix[i];
    }
    return answer;
    


        /*int index=0;
        
        int[] answer=new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            int k=0;
            int mul=1;
            while(k<nums.length) {
                if(k!=index) {
                    mul=mul*nums[k];
                    answer[i]=mul;
                }
                k++;
            }
            index++;
        }
        return answer;
    }*/
    }
}