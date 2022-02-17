package hangman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.*;
import hangman.model.*;

/**
 * Clases de equivalencia variantes GameScore:
 * 
 *OriginalScore:
 * -Caso 1: (correctCount < 0, incorrectCount > 0)
 * -Caso 2: (correctCount > 0, incorrectCount < 0)
 * -Caso 3: (correctCount < 0, incorrectCount < 0)
 * -Caso 4: (0 < incorrectCount < 10 ,correctCount >= 0)
 * -Caso 5: (incorrectCount > 10 ,correctCount >= 0)
 * -Caso 6: (incorrectCount > correctCount *2, correctCount > 0)
 *  
 *BonusScore: 
 * -Caso 1: (correctCount < 0, incorrectCount > 0)
 * -Caso 2: (correctCount > 0, incorrectCount < 0)
 * -Caso 3: (correctCount < 0, incorrectCount < 0)
 * -Caso 4: (correctCount > 0, 0 < incorrectCount <= correctCount * 2)
 * -Caso 5: (incorrectCount > correctCount *2, correctCount > 0)
 * 
 *PowerScore: 
 * -Caso 1: (correctCount < 0, incorrectCount > 0)
 * -Caso 2: (correctCount > 0, incorrectCount < 0)
 * -Caso 3: (correctCount < 0, incorrectCount < 0)
 * -Caso 4: (incorrectCount*8 > 5^correctCount)
 * -Caso 5: (incorrectCount*8 < 5^correctCount)
 * -Caso 6: (incorrectCount > 0, correctCount > 0)
 */

public class GameScoreTest {
    @Test
    /**
     * We expect a exception
     */
    public void OriginalScoreCase1(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(-1, 10);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }
    @Test
    /**
     * We expect a exception
     */
    public void OriginalScoreCase2(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, -1);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }


    @Test
    /**
     * We expect a exception
     */
    public void OriginalScoreCase3(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }

    @Test
    /**
     * Result = 50
     */
    public void OriginalScoreCase4(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 5);
        assertEquals(50, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * Result = 0
     */
    public void OriginalScoreCase5(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(10, 12);
        assertEquals(0, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * Result = 50
     */
    public void OriginalScoreCase6(){
        try{
        OriginalScore score = new OriginalScore();
        int result = score.calculateScore(4, 5);
        assertEquals(50, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * We expect a exception
     */
    public void BonusScoreCase1(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(-1, 10);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }

    @Test
    /**
     * We expect a exception
     */
    public void BonusScoreCase2(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(10, -1);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }
    
    @Test
    /**
     * We expect a exception
     */
    public void BonusScoreCase3(){
        try{
            BonusScore score = new BonusScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }

    @Test
    /**
     * Result = 30
     */
    public void BonusScoreCase4(){
        try{
        BonusScore score = new BonusScore();
        int result = score.calculateScore(4, 2);
        assertEquals(30, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * Result = 0
     */
    public void BonusScoreCase5(){
        try{
        BonusScore score = new BonusScore();
        int result = score.calculateScore(4, 9);
        assertEquals(0, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * We expect a exception
     */
    public void PowerScoreCase1(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(-1, 10);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }

    @Test
    /**
     * We expect a exception
     */
    public void PowerScoreCase2(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(10, -1);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }
    
    @Test
    /**
     * We expect a exception
     */
    public void PowerScoreCase3(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(-1, -1);
        fail();
        }
        catch(HangmanException e){
            assertEquals(e.getMessage(), HangmanException.NEGATIVE_SCORE);
        }
    }

    @Test
    /**
     * Result = 0
     */
    public void PowerScoreCase4(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(2, 4);
        assertEquals(0, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * Result = 93
     */
    public void PowerScoreCase5(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(3, 4);
        assertEquals(93, result);
        }
        catch(HangmanException e){
            fail();
        }
    }

    @Test
    /**
     * Result = 9
     */
    public void PowerScoreCase6(){
        try{
        PowerScore score = new PowerScore();
        int result = score.calculateScore(4, 2);
        assertEquals(500, result);
        }
        catch(HangmanException e){
            fail();
        }
    }
}
