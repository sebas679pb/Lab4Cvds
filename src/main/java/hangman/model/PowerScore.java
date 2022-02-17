package hangman.model;

public class PowerScore implements GameScore{

    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
        if (correctCount < 0 || incorrectCount < 0){
            throw new HangmanException(HangmanException.NEGATIVE_SCORE);
        }
        int score = (correctCount ==0)?0:(int)Math.pow(5, correctCount);
        score -= 8*incorrectCount;
        return (score > 500)?500:(score<0)?0:score;
    }
    
}
