import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman("coding");
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void newHangman_getCorrectAnswer_true() {
    Hangman testHangman = new Hangman("coding");
    assertEquals("coding", testHangman.getAnswer());
  }


}
