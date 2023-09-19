package projects.wordle;

import java.util.Scanner;

public class Wordle {
    private String secretWord;
    private int attempts;

    public Wordle(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0) {
            System.out.println("Attempts remaining: " + remainingAttempts);
            System.out.print("Enter your guess: ");
            String guessWord = scanner.nextLine();

            if(guessWord.length() != secretWord.length()) {
                System.out.println("Invalid guess. Please enter a word with the same length as the secret word.");
                continue;
            }

            int correctChars = 0;
            int correctPositions = 0;

            for(int i = 0; i < secretWord.length(); i++) {
                char c = guessWord.charAt(i);
                if(c == secretWord.charAt(i)) {
                    correctPositions++;
                } else if (secretWord.indexOf(c) >= 0) {
                    correctChars++;
                }
            }

            if(correctPositions == secretWord.length()) {
                System.out.println("You guessed it correctly!");
                break;
            } else {
                System.out.println("Correct characters: " + correctChars);
                System.out.println("Correct postisions: " + correctPositions);
                remainingAttempts--;
            }
        }
        if (remainingAttempts == 0) {
            System.out.println("Game Over. The correct word was " + secretWord);
        }
    }

    public static void main(String[] args) {
        Wordle newWord = new Wordle("fives", 5);
        newWord.play();
    }
}
