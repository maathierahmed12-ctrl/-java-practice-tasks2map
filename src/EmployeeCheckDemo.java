import java.util.HashMap;
public class EmployeeCheckDemo {
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

        boolean exists = EmployeeIDs.containsKey("14, Reem");

        System.out.println("Is in the set  EmployeeIDs :" +  exists);

        System.out.println(" result of the EmployeeIDs :" + EmployeeIDs);


        boolean notexists = EmployeeIDs.containsKey("14, Reem");

        System.out.println("Is in the set  EmployeeIDs :" +  notexists);

        System.out.println(" result  EmployeeIDs :" + EmployeeIDs);

        boolean existsname = EmployeeIDs.containsKey("13,Noor ");

        System.out.println("Is in the set  EmployeeIDs :" +  exists);

        System.out.println(" result  EmployeeIDs :" + EmployeeIDs);

        boolean notexistsname = EmployeeIDs.containsKey("13,Noor ");

        System.out.println("Is in the set  EmployeeIDs :" +  notexists);

        System.out.println(" result  EmployeeIDs :" + EmployeeIDs);

    }
}

