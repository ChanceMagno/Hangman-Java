import java.util.ArrayList;
import java.util.List;

  public class Hangman {
    private String mAnswer;
    private String mUserInput;

    public Hangman (String answer, String userInput) {
      mAnswer = answer;
      mUserInput = userInput;
    }

    public String getAnswer() {
      return mAnswer;
    }

    public String getUserInput() {
      return mUserInput;
    }

    public boolean goodInput(){
      return mAnswer.contains(mUserInput);
    }
}
