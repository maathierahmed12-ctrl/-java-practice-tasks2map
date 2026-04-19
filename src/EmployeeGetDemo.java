import java.util.HashMap;
public class EmployeeGetDemo {
    public static void main(String[]args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();

        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("Update all Employee:" + EmployeeIDs);

        EmployeeIDs.get("14,Reem");

        System.out.println("returned value clearly  Employee:" + EmployeeIDs);

        EmployeeIDs.get("13,Noor");

        System.out.println("second returned value clearly Employee:" + EmployeeIDs);



    }
}
