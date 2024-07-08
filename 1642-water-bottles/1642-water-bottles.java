class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int usedBottles=0;
        usedBottles+=numBottles;
        while(numBottles >= numExchange)
        {

            int reFill= numBottles/numExchange;
            int left= numBottles%numExchange;
            usedBottles+=reFill;
            numBottles=reFill+left;
        }
        return usedBottles;
    }
}