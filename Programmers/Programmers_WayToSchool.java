class Solution {
    
    public int solution(int m, int n, int[][] puddles) {
        int mod=1000000007;
        int arr[][]=new int[n][m];
        
        for(int item[]: puddles){
        	arr[item[1]-1][item[0]-1]=-1; //웅덩이 표시
        }
        arr[0][0]=1;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1) {
                  arr[i][j]=0;
                  continue;
                }
                if(i!=0) arr[i][j]+=arr[i-1][j] % mod; 
                if(j!=0) arr[i][j]+=arr[i][j-1] % mod;
            }
        }
        
        return arr[n-1][m-1] % mod;
    }
    
}