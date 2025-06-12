package infyqt;

public class RunLengthEncoding {

    public static String runLengthEncode(String input) {
        StringBuilder encoded = new StringBuilder();

        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            // Check if next character is same as current
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Append current character and count
                encoded.append(input.charAt(i));
                encoded.append(count);
                count = 1;  // Reset count
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        String test = "AAABBBCCDAA";
        System.out.println("Encoded String: " + runLengthEncode(test));
    }
}

