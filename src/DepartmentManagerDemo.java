import java.util.HashMap;

public class DepartmentManagerDemo {
    public static void main(String[] args) {

        HashMap<String, String> DeptManager = new HashMap<>();

        DeptManager.put("HR", "Salem");
        DeptManager.put("IT", "Fatma");
        DeptManager.put("Sales", "Nasser");
        DeptManager.put("Finance", "Eman");
        DeptManager.put("Admin", "Majed");

        System.out.println(" all  DeptManager  :" + DeptManager );

        System.out.println(" capital of one specific DeptManager :" +  DeptManager.get("Admin, Majed"));

        boolean nameexitis = DeptManager.containsKey("Sales,Nasser");

        System.out.println("Is in the see DeptManager : " + nameexitis);

        System.out.println("result clearly DeptManager :" +DeptManager);

        boolean notexitis = DeptManager.containsKey("Sales,Nasser");

        System.out.println("Is in the see DeptManager : " + notexitis);

        System.out.println("result clearly DeptManager :" +DeptManager);


        DeptManager.put("Marketing", "Hind");

        System.out.println("updated DeptManager : " + DeptManager);

        DeptManager.remove("HR", "Salem") ;

        System.out.println("after removal DeptManager : " + DeptManager);

        System.out.println("total number DeptManager :" + DeptManager.size());


    }
}


