import java.util.*;

public class ProductsImpl {
    public static ArrayList<Product>  products = new ArrayList<Product>();
    public ProductsImpl() {

    }

    //добавляет новый продукт возвращает true - если продукта с таким id еще не было
    // возвращает false - если был такой id, вставка отменяется
    public Boolean addProduct(Product product) {
        boolean chek = true;
        for(int j=0; j<products.size();j++){
            if(products.get(j).getId()==product.getId()) chek=false;
        }
        if(chek) products.add(product);
        return chek;
    }

    //Удаляет продукт возвращает true - если продукт с таким id был
    // возвроащает false - если id не было, (удаления не происходит)
    public Boolean deleteProduct(Product product) {
        boolean chek = false;
        for(int j=0; j<products.size();j++){
            if(products.get(j).getId()==product.getId()) chek=true;
        }
        if(chek) products.remove(product);
        return chek;
    }

    //Получает имя (name) продукта возращает name продукта у которого идентификатор равен (=) id
    // если продукта нет, вернуть пустую строку ""
    public String getName(String id) {
        String name = "";
        for(int j=0; j<products.size();j++){
            if(products.get(j).getId()==id) name=products.get(j).getName();
        }
        return name;
    }

    //возвращает массив (список) идентификаторов (id) У котрых наименование равно (=) name
    // Если таких нет, возвращается пустой массив (список)
    public List findByName(String name) {
        List<String> ids = new ArrayList<>();
        for(int j=0; j<products.size();j++){
            if(products.get(j).getName()==name) ids.add(products.get(j).getId());
        }
        return ids;
    }
}



