import java.util.HashMap;
import java.util.Map;
class Solution {

    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;
        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in chars
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (String word : words) {
            Map<Character, Integer> wordCount = new HashMap<>();

            // Count characters in the current word
            for (char c : word.toCharArray()) {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }

            boolean valid = true;

            // Check if the characters in the word can be formed from chars
            for (Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
                char key = entry.getKey();
                int count = entry.getValue();

                if (!charCount.containsKey(key) || charCount.get(key) < count) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        int result = solution.countCharacters(words, chars);
        System.out.println(result); // Output will be the sum of lengths of valid words
    }
}

