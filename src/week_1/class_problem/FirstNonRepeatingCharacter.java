public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        int[] count = new int[256];
        for (int i = 0; i < text.length(); i++) count[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) if (count[text.charAt(i)] == 1) return text.charAt(i);
        return '\0';
    }

    public static void main(String[] args) {
        String text = "swiss";
        char answer = findFirstNonRepeatingChar(text);
        if (answer == '\0') System.out.println("No Non-Repeating Character Found");
        else System.out.println("First Non-Repeating Character: '" + answer + "'");
    }
}
