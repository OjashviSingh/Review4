import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String userString = scanner.nextLine().toLowerCase();

        int[] frequencyArray = new int[26];

        for (int i = 0; i < userString.length(); i++) {

            char c = userString.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                frequencyArray[index] = frequencyArray[index] + 1;
            }
        }

        System.out.println("Character frequencies of the string " + userString + " is :");

        for (int i = 0; i < 26; i++) {
            if (frequencyArray[i] > 0) {
                char c = (char) (i + 'a');
                System.out.println("'" + c + "' : " + frequencyArray[i]);
            }
        }
    }
}
