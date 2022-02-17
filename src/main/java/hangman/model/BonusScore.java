package hangman.model;

public class BonusScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
        if (correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.NEGATIVE_SCORE);
        }
        return (incorrectCount>correctCount*2)?0:correctCount*10-incorrectCount*5;
    }
    
}
