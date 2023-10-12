import java.util.*;

public class paragrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean checkIfPangram(String sentence) {
        // Create a boolean array to track the presence of each alphabet
        boolean[] isAlphabetPresent = new boolean[26];

        // Iterate through the sentence and mark the presence of each alphabet
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                isAlphabetPresent[index] = true;
            }
        }

        // Check if all alphabet letters are present (i.e., all array elements are true)
        for (boolean isPresent : isAlphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }

        return true;
    }
}
