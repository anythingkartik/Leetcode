class Solution {
    public int fib(int n) {
       return fiboRecursion(n);
    }

    private int fiboRecursion(int n) {
        if(n<2) {
            return n;
        }
        return fiboRecursion(n-1) + fiboRecursion(n-2);
    }
}