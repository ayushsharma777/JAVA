public class ReverseStringVowels {
    public static String reverseVowels(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] charArray = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            while (i < j && !isVowel(charArray[i], vowels)) {
                i++;
            }
            while (i < j && !isVowel(charArray[j], vowels)) {
                j--;
            }
            if (i < j) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
        }

        return new String(charArray);
    }

    private static boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "hdllo";
        System.out.println(reverseVowels(s)); // Output: "holle"
    }
}
