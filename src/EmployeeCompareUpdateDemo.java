import java.util.HashMap;
public class EmployeeCompareUpdateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("all employee IDs :" + EmployeeIDs);

        System.out.println("current value of one employee ID:" + EmployeeIDs.get("14,Reem"));

        EmployeeIDs.put(16, "Ahmed");

        System.out.println(" new updated value employee ID:" + EmployeeIDs.get("14,Reem"));

        EmployeeIDs.put(17, "Muna");

        System.out.println(" after all updates EmployeeIDs : " + EmployeeIDs);








    }
}