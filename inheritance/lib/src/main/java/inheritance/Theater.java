package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    String name;
    ArrayList<String> movies;
    public List<Review> reviews;

    public Theater(){

    }

    public Theater(String name,ArrayList list) {
        this.name = name;
        this.movies = list;
        this.reviews=new ArrayList<>();

    }

    public String  toString() {
        ArrayList<String> msg= new ArrayList<>();
        for (int i=0; i<this.movies.size(); i++){
            msg.add(this.movies.get(i)) ;

        }
        System.out.println(msg) ;
        if(this.reviews.size()!=0){
            System.out.println( this.reviews);

        }
        return msg.toString();
    }

    public void addMovie(String newMovie ){

        this.movies.add(newMovie);
    }

    public void removeMovie(String newMovie ){
        for(int i =0; i<this.movies.size(); i++){
            if(this.movies.get(i).equals(newMovie)){
                this.movies.remove(newMovie);
            }
        }

        }

    public void addReview(String author , int NewStars , String movieName){
        moviesReview movieReview = new moviesReview( author, NewStars,movieName);
        String finalmsg="";
//        for (int i =0; i<this.movies.size(); i++){
            if(this.movies.contains(movieName)==true){
                 finalmsg += " the movie " + movieName + " has rate " + movieReview;
            }
            else {
                this.movies.add(movieName);
                System.out.print("the movie has been added");
            }
//        }
        System.out.println(finalmsg);
    }
}
