import java.util.HashMap;

public class StudentMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> StudentIDs = new HashMap<>();
        StudentIDs.put(201, "Ali");
        StudentIDs.put(202, "Mona");
        StudentIDs.put(203, "Fahad");
        StudentIDs.put(204, "Huda");
        StudentIDs.put(205, "Saud");
        System.out.println(" all  StudentIDs :" + StudentIDs);

        System.out.println("name of one specific student  :"+StudentIDs.get("205, Saud") );

        boolean exitis = StudentIDs.containsKey("202, Mona");

        System.out.println("Is in the see StudentIDs : " + exitis);

        System.out.println("result clearly StudentIDs : "+ StudentIDs);

        boolean notexitis = StudentIDs.containsKey("202, Mona");

        System.out.println("Is in the see StudentIDs : " + notexitis);

        System.out.println("result clearly StudentIDs : "+ StudentIDs);


        StudentIDs.put(206, "Zaid");

        System.out.println("updated StudentIDs :"+ StudentIDs);

        StudentIDs.remove(203, "Fahad");

        System.out.println("after removal StudentIDs : "+ StudentIDs);

        System.out.println(" total number of StudentIDs :" + StudentIDs.size());

    }

}


