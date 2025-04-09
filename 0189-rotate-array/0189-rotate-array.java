class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
        k=k%len;
        reverseArray(nums,0,len-k-1);
        reverseArray(nums,len-k,len-1);
        reverseArray(nums,0,len-1);
    }

    public int[] reverseArray(int[] arr, int s, int e) {
     while(s<e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s=s+1;
        e=e-1;
     }
     return arr;
    }
}