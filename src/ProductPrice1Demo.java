import java.util.HashMap;

public class ProductPrice1Demo {
    public static void main(String[] args) {
        HashMap<String, Double> product  = new HashMap<>();
        product .put("SKU", 4.4);
        product .put("Part", 5.5);
        product .put("UPC", 6.6);
        product .put("BOM", 7.7);
        product .put("PLM", 8.8);

        System.out.println(" all  product  :" + product );

        System.out.println("price of one specific product :"+ product.get("SKU,4.4"));

        boolean exitis = product.containsKey("Part,5.5");

        System.out.println("Is in the see product : " + exitis);

        System.out.println(" result clearly product :" + product);

        boolean notexitis = product.containsKey("Part,5.5");

        System.out.println("Is in the see product : " + notexitis);

        System.out.println(" result clearly product :" + product);

        product .put("MPN ", 10.1);

        System.out.println("updated  product :"+ product);

        product.remove("PLM",8.8);

        System.out.println("after removal product : "+ product);

        System.out.println(" total number of product :" + product.size());


    }
}
}
