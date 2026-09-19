class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        PriorityQueue<Character> pq = new PriorityQueue<>();
        PriorityQueue<Character> xy = new PriorityQueue<>();
        for (int i = 0; i < s.length(); i++)
        {
            pq.add(s.charAt(i));
        } 
        for (int j = 0; j < t.length(); j++)
        {
            xy.add(t.charAt(j));
        } 
        while(!pq.isEmpty())
        {
            if (pq.poll() != xy.poll())
            {
                return false;
            }
        }
        return true;
    }
}
