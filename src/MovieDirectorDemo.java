import java.util.HashMap;

public class MovieDirectorDemo {
    public static void main(String[] args) {
        HashMap<String, String> MovieDirector = new HashMap<>();
        MovieDirector.put("Inception", "Nolan");
        MovieDirector.put("Avatar", "Cameron");
        MovieDirector.put("Jaws", "Spielberg");
        MovieDirector.put("Psycho", "Hitchcock");
        MovieDirector.put("Pulp Fiction", "Tarantino");

        System.out.println("Update all Movie:" + MovieDirector);

        System.out.println(" director of one specific movie :" +MovieDirector.get("Psycho, Hitchcock") );

        boolean titleexitis = MovieDirector.containsKey("Emma, Austen");

        System.out.println("Is in the see Movie:" + titleexitis);

        System.out.println("result clearly Movie :" +MovieDirector);

        boolean notexitis = MovieDirector.containsKey("Emma, Austen");

        System.out.println("Is in the see Movie:" + notexitis);

        System.out.println("result clearly Movie :" +MovieDirector);

        MovieDirector.put("Gladiator", "Scott");

        System.out.println("updated Movie : " + MovieDirector );

        MovieDirector.remove("Jaws", "Spielberg");

        System.out.println("after removal Movie : " + MovieDirector );

        System.out.println(" total number of records left Movie : " + MovieDirector.size() );
    }
}