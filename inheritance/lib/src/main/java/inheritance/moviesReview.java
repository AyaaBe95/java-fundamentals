package inheritance;

public class moviesReview extends Review {

    private String movieName;

    public moviesReview(String author,int stars,String movieName){
        super(author,stars);
        this.movieName=movieName;

    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }


    @Override
    public String toString() {
        return "Review{" +
                "author='" + super.getAuthor() + '\'' +
                ", rating='" + super.getStars() + '\'' +
                ", Movie Name='" + this.getMovieName() + '\'' +
                '}';
    }
}
