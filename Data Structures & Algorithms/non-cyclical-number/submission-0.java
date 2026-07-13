class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n != 1 && !s.contains(n)){
            s.add(n);
            int t = 0;
            while(n > 0){
                int d = n % 10;
                t += d * d;
                n /= 10;
            }
            n = t;
        }
        return n == 1;
    }
}
