import java.util.HashMap;

public class EmployeeClearDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("Update all Employee:" + EmployeeIDs);

        System.out.println(" new total number of employee : "+ EmployeeIDs.size() );

        EmployeeIDs.clear();

        System.out.println("after clearing Employee:" + EmployeeIDs);

        System.out.println(" empty EmployeeIDs : " + EmployeeIDs.size() );

    }
}

