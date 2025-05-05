package Problem_solve.Array;

public class stock_buy_sell {
    static int maxprofit(int prices[]){
        int n=prices.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res,prices[j]-prices[i]);
            }
        }
        return res;
    }

    public static void main(String args[]){
        int prices[]={7,1,1,3,6,9,2,3};
        System.err.println(maxprofit(prices));
    }
}
