class Solution {
    public int numberOfSteps(int n) {
        int ans=counting(n,0);
        int count=0;
        return ans;
    }
        public int counting(int n,int count) {
        if(n==0) {
            return count;
        }
        if(n%2==0) {
            return counting(n/2,count+1);
        }
        return counting(n-1,count+1);
        }

       /* int count=0;
        while(n!=0) {
            if(n%2==0){
                count++;
                n=n/2;
            }
            else {
                n=n-1;
                count++;
            }
        }
        return count;*/
    
}