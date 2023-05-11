class Solution {
    public int numRollsToTarget(int d, int f, int target) {
        if(d*f < target) return 0;
        int[][] dp= new int[d*f+1][d+1];
        for(int i = 1; i <= f; i++) dp[i][1] = 1; //주사위가 한개일때
        
        
        for(int i = 1; i <= target; i++){ //모든 합
            for(int j = 2; j <= d; j++){ //주사위 개수만큼
                for(int k = 1; k <= f; k++){ //주사위의 각 면
                    if(j > 1 && i-k >= 1){ 
                        dp[i][j] += dp[i-k][j-1];
                        dp[i][j] %= (1000000007); 
                    }
                }
            }
        }
        return dp[target][d];
    }
}

