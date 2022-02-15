package hangman.model;

public class HangmanException extends Exception{
    public static final String NEGATIVE_SCORE = "Score out of range";

    /**
     * HangmanException constructor
     * @param message
     */
    public HangmanException(String message){
        super(message);
    }
}
