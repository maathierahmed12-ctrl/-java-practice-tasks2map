import java.util.HashMap;
public class CourseTrainerDemo {
    public static void main(String[] args) {
        HashMap<String, String> CourseTrainer = new HashMap<>();
        CourseTrainer.put("Java", "Ahmed");
        CourseTrainer.put("Python", "Sarah");
        CourseTrainer.put("SQL", "Omar");
        CourseTrainer.put("C++", "Zaid");
        CourseTrainer.put("Web", "Laila");

        System.out.println("Update all Course:" + CourseTrainer);

        System.out.println(" trainer of one specific course :" + CourseTrainer.get("Java, Ahmed"));

        boolean nameexitis = CourseTrainer.containsKey("Emma, Austen");

        System.out.println("Is in the see Course:" + nameexitis);

        System.out.println("result clearly Course :" +CourseTrainer);

        System.out.println("result Course : " + CourseTrainer );

        boolean notexitis = CourseTrainer.containsKey("Emma, Austen");

        System.out.println("Is in the see Course:" + notexitis);

        System.out.println("result clearly Course :" +CourseTrainer);

        System.out.println("result  Course :" + CourseTrainer);

        CourseTrainer.put("Cloud", "Noora");

        System.out.println("updated Course : " + CourseTrainer );

        CourseTrainer.remove("SQL", "Omar");

        System.out.println("after removal Course : " + CourseTrainer );

        System.out.println(" total number of records Course :" + CourseTrainer);

    }
}