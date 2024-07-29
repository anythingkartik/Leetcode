class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n==0)
       {
        System.out.println(nums1);
       } 
       else
       {
        int k=0;
        for(int i=m;i<m+n;i++)
        {
            nums1[i]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
       }
    }
}