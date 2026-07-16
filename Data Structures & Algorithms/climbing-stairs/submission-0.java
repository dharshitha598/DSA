class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        else {
            int f=1,s=2,temp=0,i=2;
            while(i<n){
                temp=f+s;
                f=s;
                s=temp;
                i++;
            }
            return temp;        
        } 
    }
}