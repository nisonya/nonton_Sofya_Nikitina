public class Main {
    public static ProductsImpl productsImpl =new ProductsImpl();
    public static void main(String[] args) {
        Product product = new Product("0","pen");
        add(product);
        product = new Product("2","ruler");
        add(product);
        product = new Product("1","pen");
        add(product);
        product = new Product("0","pencil case");
        add(product);
        product = new Product("3","pencil case");
        add(product);
        getName("0");
        getName("1");
        getName("2");
        getName("3");
        findByName("pen");
        findByName("ruler");
        findByName("pencil case");
        product = new Product("1","pen");
        delete(product);
        product = new Product("3","pencil case");
        delete(product);
        product = new Product("5","ruler");
        delete(product);

    }

    //Обработка добавления
    public static void add(Product product){
        if(productsImpl.addProduct(product)) System.out.println("Product added");
        else System.out.println("Product already exists");
    }

    //Обработка удаления
    public static void delete(Product product){
        if(productsImpl.deleteProduct(product)) System.out.println("Product removed");
        else System.out.println("This product does not exist");
    }

    //Обработка получения имени
    public static void getName(String id){
        String name =productsImpl.getName(id);
        if(name =="") System.out.println("This product does not exist");
        else System.out.println("Product name -"+name);
    }

    //Обработка получение списка id по имени
    public static void findByName(String name){
        System.out.println("List id with name "+name+": "+productsImpl.findByName(name));
    }

}

