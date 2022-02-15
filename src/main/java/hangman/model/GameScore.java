package hangman.model;

public interface GameScore {
    /**
     * Calculate the game score
     * @pre CorrectCount and incorrectCount must be positives
     * @param correctCount count the correct letters
     * @param incorrectCount count the mistaken letters
     * @return the game score
     * @throws HangmanException if the score goes to a negative number
     */
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException;
}
