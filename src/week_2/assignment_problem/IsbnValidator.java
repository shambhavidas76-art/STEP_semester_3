public class IsbnValidator {
    public static String normalizeCode(String raw) {
        String code = raw.trim();
        return code.length() < 3 ? code : code.substring(0, 3).toUpperCase() + code.substring(3);
    }
    public static String validateAndFormat(String code) {
        if (code.length() != 13) return "Invalid: wrong length";
        for (int i = 0; i < 3; i++) if (!Character.isLetter(code.charAt(i))) return "Invalid: publisher code must be 3 letters";
        for (int i = 3; i < 13; i++) if (!Character.isDigit(code.charAt(i))) return "Invalid: body must contain digits";
        return "[" + code.substring(0, 3) + "] YEAR: " + code.substring(3, 7) + " | CATALOG: " + code.substring(7);
    }
    public static void main(String[] args) { System.out.println(validateAndFormat(normalizeCode(" pen2026004251 "))); }
}
