/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

  public String toString() 
  {
    try{
      String info = book.toString();
      
      try{
        info = movie.toString();
        return info;
      } 
      catch(Exception e){
        return info;
      }
    } 
    catch(Exception e){
      
      String info = "No info available.";
      return info;
    }
  }
  
  public void testBook(Book tester){
    tester.setTitle("Super duper tester title");
    System.out.println("Book title change");
    System.out.println(tester);

  }
}