
package chatbotapp;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Cody Schafer
 */
public class ChatBot {
    //Fields (object vars.)
   private String name;
   private int age;
   private String favSong;
   private String favColor;
   private Boolean likesRed;
   private Double weight;
   private String purpose;
   private Date birthday;
   private Boolean isBirthday;
   private int points;
   private final Basket basket;
   
   
    //constructor (creates object)
    public ChatBot(){
        name = "ChatterBot";
        age =154;
        favSong = "";
        favColor = "Blue";
        likesRed = true;
        weight = 180.1;
        purpose = "live";
        birthday = null ;
        isBirthday = null;
        points = 0;
        basket = new Basket();
        
    }
    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavSong() {
        return favSong;
    }

    public void setFavSong(String favSong) {
        this.favSong = favSong;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public Boolean getLikesRed() {
        return likesRed;
    }

    public void setLikesRed(Boolean likesRed) {
        this.likesRed = likesRed;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getIsBirthday() {
        return isBirthday;
    }

    public void setIsBirthday(Boolean isBirthday) {
        this.isBirthday = isBirthday;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    

    
    //methods
   public String respond(String prompt){
       if (prompt.equals("age")){
         return ""+age;
       }
       else if(prompt.equals("favorite color")){
           return favColor;
       }
       else if(prompt.equals("what is your name?")){
       return name;
       }
       else if(prompt.equals("eat food")){
             
       }
       else if (prompt.equals("hello")){
           return "Hello!";
       }
       else if(prompt.equals("goodbye")){
           return "goodbye!";
           
       }
       else if(prompt.equals("get date")){
           double date = System.currentTimeMillis();
          SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         return(format.format(date));
       }
       
       else if(prompt.equals("what is your weight")){
           return weight+"";
       }
       return "I dont understand";
   }
       public void eat(Food food){
        weight += food.getWeight();
           
           
       }
   
    
}
