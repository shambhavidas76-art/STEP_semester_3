public class TypingAccuracyChecker {
    public static void checkTypingAccuracy(String original, String typed) {
        int matched = 0;
        int firstMismatch = -1;
        int length = Math.min(original.length(), typed.length());
        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) matched++;
            else if (firstMismatch == -1) firstMismatch = i;
        }
        if (original.length() != typed.length() && firstMismatch == -1) firstMismatch = length;
        int total = original.length();
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%%n", matched, total, matched * 100.0 / total);
        if (firstMismatch == -1) System.out.println("No Mismatches");
        else if (firstMismatch < length) System.out.println("First Mismatch at position " + (firstMismatch + 1) + " ('" + original.charAt(firstMismatch) + "' vs '" + typed.charAt(firstMismatch) + "')");
        else System.out.println("First Mismatch at position " + (firstMismatch + 1) + " (different length)");
    }

    public static void main(String[] args) {
        checkTypingAccuracy("hello world", "hello worlt");
    }
}
