import java.util.*;

public class ProductsImpl {
    public static ArrayList<Product>  products = new ArrayList<Product>();
    public ProductsImpl() {

    }
    public Boolean addProduct(Product product) {
        boolean chek = true;
        for(int j=0; j<products.size();j++){
            if(products.get(j).getId()==product.getId()) chek=false;
        }
        if(chek) products.add(product);
        return chek;
    }
    public Boolean deleteProduct(Product product) {
        boolean chek = false;
        for(int j=0; j<products.size();j++){
            if(products.get(j).getId()==product.getId()) chek=true;
        }
        if(chek) products.remove(product);
        return chek;
    }

    public String getName(String id) {
        String name = "";
        for(int j=0; j<products.size();j++){
            if(products.get(j).getId()==id) name=products.get(j).getName();
        }
        return name;
    }
    public List findByName(String name) {
        List<String> ids = new ArrayList<>();
        for(int j=0; j<products.size();j++){
            if(products.get(j).getName()==name) ids.add(products.get(j).getId());
        }
        return ids;
    }
}



