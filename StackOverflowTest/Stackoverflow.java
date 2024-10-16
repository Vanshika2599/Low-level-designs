package StackOverflowTest;

import java.util.ArrayList;
import java.util.List;

public class Stackoverflow {
    private List<Questions> questions;
    
    Stackoverflow() {
      questions = new ArrayList<>();
    }

    public void mainFunc() {
      User vanshika = new User("Vanshika", "123");
      User alice = new User("Alice", "789");
      User manu = new User("Manu", "12378");
      
      Questions question1 = new Questions("Multiple inheritance in java", "Is mupltiple inheritance posisble in java?", alice);
      vanshika.addVote(question1);
      vanshika.addComment(question1, "That's a good questions");
      Answers answer1 = manu.answerQuestion(question1, "No, multiple inheritance is not possible in java");
      vanshika.addVote(answer1);
      System.out.println(question1.getVotesCount());
    }
 };
