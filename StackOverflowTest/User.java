package StackOverflowTest;

import java.util.ArrayList;
import java.util.List;

public class User {
    protected String userName;
    private String emailId;
    private Integer points;
    private final List<Questions> questions;
    private final List<Answers> answers;
    private final List<Comments> comments;
    
    User(String userName, String emailId){
        this.userName = userName;
        this.emailId = emailId;
        this.points = 0;
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.comments = new ArrayList();
    }
    
    public Answers answerQuestion(Questions question, String content){
      Answers answer = new Answers(this, content, question);
      answers.add(answer);
      return answer;
    }

    public Questions addQuestion(String id, String content) {
        Questions question = new Questions(id, content, this);
        questions.add(question);
        return question;
    }

    public void addComment(Commentable comment, String content) {
        Comments com = new Comments(this.userName, content);
        this.comments.add(com);
        comment.addComment(com);
    }

    public void addVote(Votable vote){
        Votes votes = new Votes(this.userName);
        vote.addVote(votes);
    }
};
