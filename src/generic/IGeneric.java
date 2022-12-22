package generic;

import java.text.ParseException;
import java.util.List;

public interface IGeneric <T>{

    public T getById() throws ParseException;
    public List<T> getAll();
}
