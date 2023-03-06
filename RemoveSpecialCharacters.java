import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
        }

        System.out.println("String without special characters is :" + result);
    }
}
