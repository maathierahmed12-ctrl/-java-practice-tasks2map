import java.util.HashMap;

public class StudentMarksDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> StudentMarks = new HashMap<>();
        StudentMarks.put(11, 44);
        StudentMarks.put(12, 55);
        StudentMarks.put(13, 66);
        StudentMarks.put(14, 77);
        StudentMarks.put(15, 88);

        System.out.println(" all  StudentMarks :" + StudentMarks);

        System.out.println("mark of one specific student :"+StudentMarks.get("12,55") );

        boolean exitis = StudentMarks.containsKey("11,44");

        System.out.println("Is in the see StudentMarks : " + exitis);

        System.out.println("result clearly StudentMarks : "+ StudentMarks);

        StudentMarks.put(16, 99);

        System.out.println("updated StudentMarks :"+ StudentMarks);

        StudentMarks.remove(15,55);

        System.out.println("after removal StudentMarks : "+ StudentMarks);

        System.out.println(" total number of student :" + StudentMarks.size());

    }

}
