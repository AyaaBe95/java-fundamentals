package inheritance;

public class Review {

    private String author;
    private int stars;

    // constructor

    public Review(String author,int stars){
        this.author=author;
        this.stars=stars;
    }

    public String toString(){
       String msg= "Review{" +
               "author='" + author + '\'' +
               ", rating='" + stars + '\'' +
               '}';

        System.out.print(msg);
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
