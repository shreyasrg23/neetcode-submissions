class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> elementMap = new HashMap<>();
        PriorityQueue<Character> letters = new PriorityQueue<>();
        Set<String> storage = new HashSet<>();
        List<List<String>> answer = new ArrayList<>();
        for(int i = 0; i < strs.length; i++) //for each element in strs
        {
            StringBuilder word = new StringBuilder(); //value resets
            for (int j = 0; j < strs[i].length(); j++) //for each word, extracting letters
            {
                letters.add(strs[i].charAt(j));
            }
            while (!letters.isEmpty()) //organizing letters
            {
                word.append(letters.poll());
            }
            String code = word.toString();
            if (!elementMap.containsKey(code))
            {
                elementMap.put(code, new ArrayList<>());
            }
            elementMap.get(code).add(strs[i]);
            storage.add(code);//storing organizedValue so I can come back to it
        }
        for (String item : storage)
        {
            answer.add(elementMap.get(item));
        }
        return answer;
    }
}
