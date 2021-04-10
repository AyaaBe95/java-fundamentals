package inheritance;

public class Restaurant {

    public String name;
    public int stars;
    public String price_category;


    //constructor
    public Restaurant(String name,int stars,String price_category){
          this.name=name;
          this.stars=stars;
          this.price_category=price_category;
    }

    public String toString(){
        String msg = "Restaurant{" +
                "name='" + name + '\'' +
                ", rating=" + stars +
                ", price_category='" + price_category + '\'' +
                '}';
        System.out.print(msg);

        return  msg;
    }
}
