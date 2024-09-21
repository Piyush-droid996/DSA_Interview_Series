public class CountVC {
    public static void main(String[] args) {
        String name = "Piyush";
        int v = 0; // Vowel count
        int c = 0; // Consonant count
        
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            // Check for vowels (both lower and upper case)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                v++;
            }
             else   { // Check if it's a letter
                c++;
            }
        }
        
        // Print the final counts
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
