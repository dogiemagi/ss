public class palindrome107 {
    public static void main(String[] args) {
        // String input = "Racecar";
        String input = "Hello";
        boolean result = isPalindrome(input);
        System.out.println(result);
    }

    static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = cleanedStr.length() - 1;
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
