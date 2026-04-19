import java.util.HashMap;

public class CountryCapital1Demo {
    public static void main(String[] args) {
        HashMap<String, String> CountryCapital = new HashMap<>();
        CountryCapital.put("Saudi Arabia", "Riyadh");
        CountryCapital.put("Egypt", "Cairo");
        CountryCapital.put("Japan", "Tokyo");
        CountryCapital.put("France", "Paris");
        CountryCapital.put("Brazil", "Brasilia");

        System.out.println(" all  Country  :" + CountryCapital );

        System.out.println(" capital of one specific country :" +  CountryCapital.get("Egypt, Cairo"));

        boolean nameexitis = CountryCapital.containsKey("JapanTokyo");

        System.out.println("Is in the see Country : " + nameexitis);

        System.out.println("result clearly Country :" +CountryCapital);

        boolean notexitis = CountryCapital.containsKey("JapanTokyo");

        System.out.println("Is in the see Country : " + notexitis);

        System.out.println("result clearly Country :" +CountryCapital);


        CountryCapital.put("Italy", "Rome");

        System.out.println("updated Country : " + CountryCapital);

        CountryCapital.remove("France", "Paris") ;

        CountryCapital.remove("Japan", "Tokyo");

        System.out.println("after removal Country : " + CountryCapital);

        System.out.println("total number Country :" + CountryCapital.size());


    }
}

