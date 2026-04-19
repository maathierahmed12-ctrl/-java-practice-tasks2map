import java.util.HashMap;

public class EmployeeEmptyDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("all employee IDs :" + EmployeeIDs);

        System.out.println("--- isEmpty ---");
        String emptyText1 = "";
        System.out.println("Is empty: " + emptyText1.isEmpty());
        System.out.println("Is blank: " + emptyText1.isBlank());

        System.out.println("result clearly EmployeeIDs :" + EmployeeIDs);

        EmployeeIDs.clear();

        System.out.println("after clearing EmployeeIDs : " + EmployeeIDs);


        System.out.println("--- isEmpty ---");
        String emptyText2 = "";
        System.out.println("Is empty: " + emptyText2.isEmpty());
        System.out.println("Is blank: " + emptyText2.isBlank());

        System.out.println("result clearly EmployeeIDs : " + EmployeeIDs);
    }
}