package pl.ts.database;

import org.springframework.stereotype.Component;
import pl.ts.model.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class Database {
    List<Product> products = new ArrayList<>();

    public Database(List<Product> products) {
        products.add(new Product(1,"Gitara", "muzyka", 500.0, "0001", 1));
        products.add(new Product(2, "Opona", "motoryzacja", 2000.0, "0002", 4));
        products.add(new Product(3, "Pralka", "dom", 1500.0, "0003", 1));
        products.add(new Product(4, "Szklanki", "kuchnia", 75.0, "0004", 8));
    }

    public List<Product> getAllProducts(){
        return this.products;
    }
}
