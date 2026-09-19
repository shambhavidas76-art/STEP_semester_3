import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FilteredWordFrequency {
    public static void printFilteredWordFrequency(String feedback) {
        String clean = feedback.toLowerCase().replace(".", "").replace(",", "");
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        HashMap<String, Integer> count = new HashMap<>();
        for (String word : clean.split("\\s+")) {
            boolean stop = false;
            for (String stopWord : stopWords) if (word.equals(stopWord)) stop = true;
            if (!stop) count.put(word, count.getOrDefault(word, 0) + 1);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        for (Map.Entry<String, Integer> entry : entries) System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    public static void main(String[] args) { printFilteredWordFrequency("The mentor was great, the session was great and clear."); }
}
