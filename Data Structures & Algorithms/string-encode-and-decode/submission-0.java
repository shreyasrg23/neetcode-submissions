class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String item : strs) {
            for (int i = 0; i < item.length(); i++) {
                char letter = item.charAt(i);
                int ascii = (int) letter;

                sb.append(ascii);
                sb.append("-");
            }
            sb.append("|");
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();

        StringBuilder number = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (current == '-') {
                int asciiNum = Integer.parseInt(number.toString());

                char letter = (char) asciiNum;
                word.append(letter);

                number.setLength(0);
            }

            else if (current == '|') {
                answer.add(word.toString());
                word.setLength(0);
            }

            else {
                number.append(current);
            }
        }

        return answer;
    }
}