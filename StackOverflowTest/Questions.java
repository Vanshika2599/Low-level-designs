package StackOverflowTest;

import java.util.ArrayList;
import java.util.List;

public class Questions implements Votable, Commentable {
    private User user;
    private String content;
    private String id;
    private List<Answers> answers;
    private List<Votes> votes;
    private List<Comments> comments;
    
    Questions(String id, String content, User user) {
        this.user = user;
        this.content = content;
        this.id = id;
        this.answers = new ArrayList<>();
        this.votes = new ArrayList<>();
        this.comments = new ArrayList<>();
    }
   
    @Override
    public void addComment(Comments comment) {
       this.comments.add(comment);
    }


    @Override
    public void addVote(Votes vote) {
       this.votes.add(vote);
    }

    public void addAnswer(Answers answer){
        this.answers.add(answer);
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public Integer getVotesCount() {
       return votes.size();
    }
}
