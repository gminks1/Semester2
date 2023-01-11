
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";
    for(Book x : childrensBooks){
      if(authorToFind.equals(x.getAuthor())){
        System.out.println(x.getTitle());
      }

    }
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for(Book x : childrensBooks){
      if(bookToFind.equals(x.getTitle())){
        System.out.println(x.getRating());
        minimumRating = x.getRating();
      }
    
  }
  System.out.println("min rating: " + minimumRating);
  for(Book x : childrensBooks){
    if(minimumRating == x.getRating()){
      System.out.println(x.getTitle() + " by, " + x.getAuthor());
    }
}

}
}