import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostMentionedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        Map<String, Integer> wordCounts = new HashMap<>();

        // Split text into words
        String[] words = text.split(" ");

        // Calculate the number of each word
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            // If this word already exists in wordCounts, increase its count,
            // otherwise add it as 1
            if (wordCounts.containsKey(lowercaseWord)) {
                wordCounts.put(lowercaseWord, wordCounts.get(lowercaseWord) + 1);
            } else {
                wordCounts.put(lowercaseWord, 1);
            }
        }

        // Find the most mentioned word and the highest number of words
        String mostFrequentWord = null;
        int maxCount = 0;

        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);

            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        // Print
        if (mostFrequentWord != null) {
            System.out.println("Most mentioned word : " + mostFrequentWord + ", Number : " + maxCount);
        } else {
            System.out.println("Word not found! ");
        }
    }

}
