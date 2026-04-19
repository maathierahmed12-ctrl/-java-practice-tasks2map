import java.util.HashMap;

public class EmployeeMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeIDs = new HashMap<>();
        employeeIDs.put(101, "Ahmed");
        employeeIDs.put(102, "Sarah");
        employeeIDs.put(104, "Laila");
        employeeIDs.put(105, "Sami");
        employeeIDs.put(106, "Noura");

        System.out.println("Update all employee:" + employeeIDs);

        System.out.println(" name of one specific employee :" + employeeIDs.get("106, Noura") );

        boolean exitis = employeeIDs.containsKey("105, Sami");

        System.out.println("Is in the see employee:" + exitis);

        System.out.println("result clearly employee :" +employeeIDs);

        boolean notexitis = employeeIDs.containsKey("105, Sami");

        System.out.println("Is in the see employee:" + notexitis);

        System.out.println("result clearly employee :" +employeeIDs);

        employeeIDs.put(103, "Omar");

        System.out.println("updated employee : " + employeeIDs);

        employeeIDs.remove(102, "Sarah");

        System.out.println( "after removal employee :" + employeeIDs);

        System.out.println(" total number of records left employee" + employeeIDs.size());


    }
}