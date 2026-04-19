import java.util.HashMap;

public class BookAuthorDemo {

    public static void main(String[] args) {
        HashMap<String, String> BookAuthor = new HashMap<>();
        BookAuthor.put("Hamlet", "Shakespeare");
        BookAuthor.put("Emma", "Austen");
        BookAuthor.put("Ulysses", "Joyce");
        BookAuthor.put("Beloved", "Morrison");
        BookAuthor.put("Iliad", "Homer");

        System.out.println(" all  BookAuthor  :" + BookAuthor );

        System.out.println( "author of one specific book :" + BookAuthor.get("Iliad, Homer"));

        boolean titleexitis = BookAuthor.containsKey("Emma, Austen");

        System.out.println("Is in the see BookAuthor : " + titleexitis);

        System.out.println("result clearly BookAuthor :" +BookAuthor);

        BookAuthor.put("Dracula", "Stoker");

        System.out.println("updated  BookAuthor :"+ BookAuthor);

        BookAuthor.remove("Iliad", "Homer");

        System.out.println("after removal BookAuthor : " + BookAuthor);

        System.out.println("total number of records BookAuthor: " + BookAuthor.size());


    }
}