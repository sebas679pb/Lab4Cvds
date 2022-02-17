package hangman.model;

public class OriginalScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
        if (correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.NEGATIVE_SCORE);
        }
        return (incorrectCount<10)?100-incorrectCount*10:0;
    }
}
