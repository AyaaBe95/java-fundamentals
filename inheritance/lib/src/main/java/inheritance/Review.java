package inheritance;

import java.util.ArrayList;

public class Review {

    private String author;
    private int stars;

    // constructor
    public Review(){

    }

    public Review(String author,int stars){
        this.author=author;
        this.stars=stars;

    }

    public String toString(){
       String msg= "Review{" +
               "author='" + author + '\'' +
               ", rating='" + stars + '\'' +
               '}';

        return msg;

    }

    public int getStars() {
        return stars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
