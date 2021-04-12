package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    public String name;
    public int starsRating;
    public String price_category;
    public List<Review>reviews;


    //constructor
    public Restaurant(String name,int starsRating,String price_category){
          this.name=name;
          this.starsRating=starsRating;
          this.price_category=price_category;
          this.reviews=new ArrayList<>();
    }

    //update toString (add Review)

    public String toString(){
        String msg = "Restaurant: " +
                "name='" + name + '\n' +
                ", rating=" + starsRating +'\n'+
                ", price_category='" + price_category + '\n' +
                reviews  +
                '}';
        System.out.print(msg);

        return  msg;
    }

    // add review
    public void addReview(String newReview , int NewStars){
        Review review = new Review( newReview, NewStars);
        this.reviews.add(review);
    }

    //calculate the average

    public int averageReview(){
        int sum=0;
        for(Review current : reviews){
            sum+=current.getStars();
        }
        starsRating = sum/reviews.size();

        System.out.print(sum);

        return sum;

    }
}
