public class WordReversalEncoder {
    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) word.append(words[i].charAt(j));
            result += word;
            if (i < words.length - 1) result += " ";
        }
        return result;
    }
    public static void main(String[] args) { System.out.println(reverseEachWord("hello club")); }
}
