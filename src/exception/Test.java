package exception;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;

public class Test {
    private static final Long EX_TIME = 60000L; //60s
    private static final Long EX_TIME1 = 0L;

    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis() - EX_TIME);
        Token token = new Token(1, timestamp);
            checkExpired(token);
    }

    public static void checkExpired(Token token) {
        Timestamp tokenTime = token.getExpireTime();
        Timestamp current = new Timestamp(System.currentTimeMillis());
        if (tokenTime.before(current)) {
            throw new ExpiredException("This token is expired!");
        }
        System.out.println("Token is good for use");
    }
}
