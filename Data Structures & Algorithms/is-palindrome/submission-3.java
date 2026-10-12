class Solution {
    public boolean isPalindrome(String s) {
        Stack <Character> normalOrder = new Stack<>();
        Stack <Character> reverseOrder = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                normalOrder.push(Character.toLowerCase(s.charAt(i)));
            }
        }
        for (int i = s.length()-1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                reverseOrder.push(Character.toLowerCase(s.charAt(i)));
            }
        }

        while (!normalOrder.isEmpty()) {
            if (normalOrder.pop() != reverseOrder.pop()) {
                return false;
            }
        }
        return true;
    }
}
