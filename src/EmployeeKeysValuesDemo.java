import java.util.HashMap;
public class EmployeeKeysValuesDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("all employee IDs :" + EmployeeIDs.keySet());

        System.out.println("all employee names :" + EmployeeIDs );

        EmployeeIDs.put(16, "Ahmed");

        System.out.println("updated employee  :" + EmployeeIDs.keySet() + EmployeeIDs.values() );
    }
}