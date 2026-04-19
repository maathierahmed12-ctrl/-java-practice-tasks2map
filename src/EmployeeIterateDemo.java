import java.util.HashMap;
import java.util.Map;

public class EmployeeIterateDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> EmployeeIDs = new HashMap<>();
        EmployeeIDs.put(11, "Ali");
        EmployeeIDs.put(12, "Sara");
        EmployeeIDs.put(13, "Noor");
        EmployeeIDs.put(14, "Reem");
        EmployeeIDs.put(15, "Omar");

        System.out.println("full employee IDs :" + EmployeeIDs);

        for (Map.Entry<Integer,String> x : EmployeeIDs.entrySet()) {
            System.out.println(x.getKey() + " 101-> Ali" + x.getValue());
        }
            EmployeeIDs.put(16, "Ahmed");

            System.out.println("Update employee IDs :" + EmployeeIDs);

        }
    }
