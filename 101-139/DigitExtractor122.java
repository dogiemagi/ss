public class DigitExtractor122 {
    public static int filterDigits(String input1) {
        if (input1 == null || input1.isEmpty()) {
            return 0;
        }

        StringBuilder digits = new StringBuilder();
        for (char ch : input1.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }
        if (digits.length() == 0) {
            return 0;
        }
        return Integer.parseInt(digits.toString());
    }

    public static void main(String[] args) {
        System.out.println(filterDigits("V12t34u5"));
        System.out.println(filterDigits("Vtu17788"));
        System.out.println(filterDigits("abc"));
        System.out.println(filterDigits("a1b2c3"));
    }
}
