public class Song {
  private String title;
  private String author;
  private double rating;
  private String date;
  
  /*** Constructor ****/
  public Song(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
    date = Date.getDate();
  }

  public Song(String t) {
    title = t;
    author = "";
    rating = 0;
    date = Date.getDate();
  }

  public boolean equals(Song b) {
    if (title == b.title && author == b.author) {
      return true;
    }
    return false;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public double getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author + " added at " + date;
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

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int r) {
    if (r < 0 || r > 10) { return; }
    rating = r;
  }
}