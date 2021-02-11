import java.util.Arrays;

class Solution {
    
    static int dp[][];
    
    public int solution(int[][] triangle) {
         dp=new int[triangle.length][triangle.length];
         for(int arr[] : dp){ 
	       Arrays.fill(arr, -1);
         }
         for(int i=0;i<dp[0].length;i++){ 
             dp[dp.length-1][i]=triangle[triangle.length-1][i];
         }
        
        return f(0,0, triangle);
    }
    
    public int f(int y, int x, int[][] triangle){
        if(dp[y][x]!=-1) return dp[y][x];
        return dp[y][x] = triangle[y][x] + Math.max( f(y+1, x, triangle) , f(y+1, x+1, triangle) );
    }
}