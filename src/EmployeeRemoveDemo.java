import java.util.HashMap;
public class EmployeeRemoveDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();

        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("Update all Employee:" + EmployeeIDs);

        EmployeeIDs.remove(11, "Ali");

        System.out.println("after removing the employee :" + EmployeeIDs);

        EmployeeIDs.remove(14, "Reem" );

        System.out.println("Update Employee:" + EmployeeIDs);

        boolean removeID= EmployeeIDs.containsKey("14, Reem");

        System.out.println("Is in the set  EmployeeIDs :" +  removeID);

        System.out.println("result EmployeeIDs :" + EmployeeIDs );

    }
}