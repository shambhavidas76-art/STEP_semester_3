public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        for (int left = 0, right = text.length() - 1; left < right; left++, right--) {
            if (text.charAt(left) != text.charAt(right)) return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text.length() <= 1) return true;
        if (text.charAt(0) != text.charAt(text.length() - 1)) return false;
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] letters = text.toCharArray();
        char[] reversed = new char[letters.length];
        for (int i = 0; i < letters.length; i++) reversed[i] = letters[letters.length - 1 - i];
        return text.equals(new String(reversed));
    }

    public static void main(String[] args) {
        String text = "madam";
        System.out.println("Text: " + text);
        System.out.println("Iterative: " + isPalindromeIterative(text));
        System.out.println("Recursive: " + isPalindromeRecursive(text));
        System.out.println("Array reversal: " + isPalindromeArrayReversal(text));
    }
}
