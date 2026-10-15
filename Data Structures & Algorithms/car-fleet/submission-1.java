class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < position.length; i++) {
            map.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        for (int i = position.length - 1; i > -1; i--) {
            double time = (double)(target-position[i])/map.get(position[i]);
            if (stack.isEmpty()) {
                stack.push(time);
            }
            else if (stack.peek() < time) { //because GREATER time means longer to get ther
                stack.push(time);
            }
        }
        return stack.size();
    }
}
