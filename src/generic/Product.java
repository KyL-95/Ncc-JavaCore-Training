package generic;

import java.text.ParseException;
import java.util.Collections;
import java.util.List;

public class Product implements IGeneric<Product> {
    private int id;
    private String name;

    @Override
    public Product getById() throws ParseException {
        return new Product();
    }

    @Override
    public List<Product> getAll() {
        return Collections.emptyList();
    }
}
