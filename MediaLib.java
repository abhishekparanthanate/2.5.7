/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  private static String owner = "Me";

  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m)
  {
    movie = m;
  }

  public void addSong(Song s) {
    if (song == null) {
      numEntries++;
      numSongs++;
      song = s;
    } else {
      System.out.println("cannot add more than one Song!");
    }
  }

  public void changeSong(Song s) {
    song = s;
  }


  public static String getOwner() {
    return owner;
  }

  public static int getNumEntries() {
    return numEntries;
  } 

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  

  public String toString() 
  {
    String info = "book: " + book + "\nmovie: " + movie + "\nsong: " + song;
    
    return info;
  }


  // public String toString() 
  // {
  //   try{
  //     String info = book.toString();
      
  //     try{
  //       info = movie.toString();
  //       return info;
  //     } 
  //     catch(Exception e){
  //       return info;
  //     }
  //   } 
  //   catch(Exception e){
      
  //     String info = "No info available.";
  //     return info;
  //   }
  // }
  
  public void testBook(Book tester){
    tester.setTitle("Super duper tester title");
    System.out.println("Book title change");
    System.out.println(tester);

  }
}