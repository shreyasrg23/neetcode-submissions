class Solution {
    public boolean isValid(String s) {
        Stack <Character> open = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if ((symbol == ']' || symbol == '}' || symbol == ')') && open.isEmpty()) {
                return false;
            }
            else if (symbol == ']') {
                if (open.pop() != '[') {
                    return false;
                }
            }
            else if (symbol == '}') {
                if (open.pop() != '{') {
                    return false;
                }
            }
            else if (symbol == ')') {
                if (open.pop() != '(') {
                    return false;
                }
            }
            else if (symbol == '[' || symbol == '{' || symbol == '(') {
                open.push(symbol);
            }
        }
        if (!open.isEmpty()) {
            return false;
        }
        return true;
    }
}
