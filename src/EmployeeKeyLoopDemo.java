import java.util.HashMap;

public class EmployeeKeyLoopDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("full EmployeeIDs :" + EmployeeIDs);

        System.out.println(" all employee IDs :" + EmployeeIDs.keySet());

        for (Integer key : EmployeeIDs.keySet()) ;
        {

        }
        EmployeeIDs.put(16, "Ahmed");

        for (Integer key : EmployeeIDs.keySet()) ;
        {

        }

        System.out.println("updated EmployeeIDs : " + EmployeeIDs);
    }
}