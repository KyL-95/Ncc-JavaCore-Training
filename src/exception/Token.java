package exception;

import java.sql.Timestamp;
import java.util.Date;

public class Token {
    private int id;
    private Timestamp expireTime;

    public Token(int id, Timestamp expireTime) {
        this.id = id;
        this.expireTime = expireTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Timestamp expireTime) {
        this.expireTime = expireTime;
    }
}
