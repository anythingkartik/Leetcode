class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        int num=x;
        int rev=0,rem;
            while(num>0)
            {
                rem=num%10;
                rev =rev*10+rem;
                num=num/10;
            }
    return rev==x;
    }
}