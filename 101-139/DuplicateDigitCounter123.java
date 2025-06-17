public class DuplicateDigitCounter123 {
    public static int countDuplicateDigits(int input1) {
        int[] digitCount = new int[10];
        String numStr = String.valueOf(input1);
        for (char ch : numStr.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                digitCount[digit]++;
            }
        }
        int duplicateCount = 0;
        for (int count : digitCount) {
            if (count > 1) {
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

    public static void main(String[] args) {
        System.out.println(countDuplicateDigits(12377));
        System.out.println(countDuplicateDigits(433377));
        System.out.println(countDuplicateDigits(112233));
        System.out.println(countDuplicateDigits(456789));
        System.out.println(countDuplicateDigits(999999));
    }
}
