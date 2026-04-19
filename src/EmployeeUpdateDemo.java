import java.util.HashMap;
public class EmployeeUpdateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("Update all Employee:" + EmployeeIDs);

        System.out.println("Update Employee:" + EmployeeIDs);

        boolean exist= EmployeeIDs.containsKey("14, Reem");

        System.out.println("Is is the set  EmployeeIDs :" +  exist);

        EmployeeIDs.get("17, Muna");

        EmployeeIDs.put(18, "Wafa");

        System.out.println(" after the second update EmployeeIDs :" + EmployeeIDs);


    }
}
