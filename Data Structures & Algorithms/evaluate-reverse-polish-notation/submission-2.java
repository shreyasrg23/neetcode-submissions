class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> symbols = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+"))
            {
                symbols.push(symbols.pop() + symbols.pop());
            }
            else if (token.equals("-"))
            {
                int two = symbols.pop();
                int one = symbols.pop();
                symbols.push(one - two);
            }
            else if (token.equals("*"))
            {
                symbols.push(symbols.pop() * symbols.pop());
            }
            else if (token.equals("/"))
            {
                int two = symbols.pop();
                int one = symbols.pop();
                symbols.push(one / two);
            }
            else {
                symbols.push(Integer.valueOf(token));
            }
        }
        return symbols.pop();
    }
}
