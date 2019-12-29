package sw1_project;

public class Post {
    String text ;
    int likes ; 
    int shares ; 

    public Post() {}
    
    public Post(String text, int likes, int shares) {
        this.text = text;
        this.likes = likes;
        this.shares = shares;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public int getShares() {
        return shares;
    }
    
    
}
