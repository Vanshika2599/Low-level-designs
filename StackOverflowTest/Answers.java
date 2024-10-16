package StackOverflowTest;

import java.util.ArrayList;
import java.util.List;

public class Answers implements Commentable, Votable{
    private User user;
    private String content;
    private Questions question;
    private final List<Comments> comments;
    private final List<Votes> votes;


    Answers(User user, String content, Questions question) {
     this.content = content;
     this.question = question;
     this.comments = new ArrayList<>();
     this.votes = new ArrayList<>();
     this.user = user;
    }


    @Override
    public void addVote(Votes vote) {
        votes.add(vote);
    }


    @Override
    public void addComment(Comments comment) {
        comments.add(comment);
    }
     
};
