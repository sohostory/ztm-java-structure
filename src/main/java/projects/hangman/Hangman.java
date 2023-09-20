package projects.hangman;

import java.util.HashSet;
import java.util.Scanner;

public class Hangman {
    private String secretWord;
    private int attempts;
    private StringBuilder guessedWord = new StringBuilder("");
    private HashSet<Character> guessedLetters;

    public Hangman(String secretWord, int attempts) {
        this.secretWord = secretWord;
        this.attempts = attempts;
        for (int i = 0; i < secretWord.length(); i++) {
            guessedWord.append("_");
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int remainingAttempts = attempts;

        while (remainingAttempts > 0) {
            System.out.println("Remaining attempts: " + remainingAttempts);
            System.out.print("Enter a letter: ");
            String letter = scanner.nextLine();

            for(int i = 0; i < secretWord.length(); i++) {
                if(secretWord.charAt(i) == letter.charAt(0)) {
                    guessedWord.replace(i,i+1, letter);
                    System.out.println(guessedWord);
                }
            }
            remainingAttempts--;
        }
    }
    public static void main(String[] args) {
        Hangman hangman = new Hangman("secret", 5);
        hangman.play();
    }
}

