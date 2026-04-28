class Solution {
    public void reverseString(char[] s) {
        int l = 0, f = s.length - 1;
        while (l < f){
            char temp = s[l];
            s[l] = s[f];
            s[f] = temp;
            l++;
            f--;
        }
    }
}