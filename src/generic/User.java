package generic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class User implements IGeneric<User>{
    private int id;
    private String name;
    private Date dob;

    private final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public User(int id, String name, Date dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public User getById() throws ParseException {
        return new User(1,"Khánh",format.parse("25/09/1995") );
    }

    @Override
    public List<User> getAll() {
        return Collections.emptyList();
    }
}
