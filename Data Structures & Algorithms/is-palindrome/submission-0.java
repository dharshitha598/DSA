class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        int p1 = 0, p2 = str.length() - 1;
        while (p1 < p2) {
            if (str.charAt(p1) != str.charAt(p2)) return false;
            p1++;
            p2--;
        }
        return true;
    }
}
