public class Movie {
    /*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */

  private String title;
  private double duration;
  private int rating;
  
  /*** Constructor ****/
  public Movie(String t, double d)
  {
    title = t;
    duration = d;
    rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", with a duration of " + duration;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    duration = d;
  }

  public void adjustRating(int value){
    if (((rating + value) < 10) && ((rating + value) > 0)){
      rating += value;
    }
    value = 7;
  }

  public boolean equals(Movie m){
    boolean sameTitle = (m.title).equals(this.title);
    boolean sameDuration = (m.duration == this.duration);

    return (sameTitle && sameDuration);
  }
}

