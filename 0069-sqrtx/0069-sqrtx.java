class Solution {
    public int mySqrt(int x) {
        int s=0;
        int e=x;
        int ans=0;
        int mid=0;

        if(x==0 || x==1) {
            return x;
        }
        else{

            while(s<=e) {
            mid=s+(e-s)/2;

            if(mid <= x / mid) {
                ans=mid;
                s=mid+1;
            }
            else {
                e=mid-1;
            }
            }
        }
    return ans;
    }
}