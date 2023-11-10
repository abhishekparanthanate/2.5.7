/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book created " + myBook);
    System.out.println("Library:\n" + myLib);
    myLib.addBook(myBook);
    System.out.println("Library:\n" + myLib);
    int myRating = 115;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    myBook.setTitle("Cool title");
    System.out.println("Book:" + myBook);
    System.out.println("Library: " + myLib);

      /*
    * Activity 2.5.7
    */
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    System.out.println("before test:" + newBook);
    myLib.testBook(newBook);
    System.out.println("after test:" + newBook);

    Book newBook2 = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook2);
    newBook2.setTitle("Totally wrong");
    //newBook2.title = "Totally wrong";
    newBook2.setAuthor("Not at all correct");
    //newBook2.author = "Not at all correct";
    System.out.println(newBook.equals(newBook2));
    //Error
    //System.out.println(newBook2.title);

    Movie movie1 = new Movie("Avengers", 1.75);
    Movie movie2 = new Movie("Avengers", 1.76);
    System.out.println(movie1);
    myLib.addMovie(movie1);
    System.out.println(movie1.equals(movie2));
  }
}