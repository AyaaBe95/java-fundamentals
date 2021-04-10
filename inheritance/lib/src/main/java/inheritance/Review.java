package inheritance;

public class Review {

    public String author;
    public int stars;

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
}
