public class CommaSeparatedTransformation113 {
    public static void main(String[] args) {
        String input = "a, b, c , d ,e";
        // String input = "x , y , z";
        String result = transformCharacters(input);
        System.out.println("Transformed String: " + result);
    }

    public static String transformCharacters(String input) {
        String noSpaces = input.replace(" ", "");
        String[] characters = noSpaces.split(",");
        StringBuilder result = new StringBuilder();
        for (String ch : characters) {
            result.append(ch.toUpperCase());
        }
        return result.toString();
    }
}
