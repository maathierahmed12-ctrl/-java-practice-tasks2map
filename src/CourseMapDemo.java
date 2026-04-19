import java.util.HashMap;

public class CourseMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> course = new HashMap<>();
        course.put("Java", "Ahmed");
        course.put("Python", "Sarah");
        course.put("SQL", "Omar");
        course.put("C++", "Zaid");
        course.put("Web", "Laila");

        System.out.println("Update all Course:" + course);

        System.out.println(" trainer of one specific course :" + course.get("Java, Ahmed"));

        boolean exitis = course.containsKey("Web, Laila");

        System.out.println("Is in the see Course:" + exitis);

        System.out.println("result clearly Course :" + course);

        boolean notexitis = course.containsKey("Web, Laila");

        System.out.println("Is in the see Course:" + notexitis);

        System.out.println("result clearly Course :" + course);

        course.put("Cloud", "Noora");

        System.out.println("updated Course :" + course );

        course.remove("C++", "Zaid");

        System.out.println("after removal Course : " + course);

        System.out.println("total number of records Course: " + course.size());

    }
}