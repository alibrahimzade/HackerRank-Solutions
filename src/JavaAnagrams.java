//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JavaAnagrams {
    public static void main(String[] args) {
        boolean anagram = isAnagram("abc", "bac");
        System.out.printf("Anagram found: %b", anagram);
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        // Normalize both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Count characters from a and subtract from b
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        // If all frequencies are 0, then it's an anagram
        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}