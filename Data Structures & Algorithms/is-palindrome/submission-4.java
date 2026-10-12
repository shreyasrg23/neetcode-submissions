class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while (i <= j) {
            char first = Character.toLowerCase(s.charAt(i));
            char last = Character.toLowerCase(s.charAt(j));
            if ((Character.isLetter(first) || Character.isDigit(first)) && (Character.isLetter(last) || Character.isDigit(last))) {
                if (first != last) {
                    return false;
                }
                i++;
                j--;
            }
            if (!(Character.isLetter(first) || Character.isDigit(first))) {
                i++;
            }
            if (!(Character.isLetter(last) || Character.isDigit(last))) {
                j--;
            }
        }
        return true;
    }
}
