package dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {
        String patern1 = "dd-MM-yyyy";
        String patern2 = "dd-MMM-yyyy";


        SimpleDateFormat df1 = new SimpleDateFormat(patern1 );
        SimpleDateFormat df2 = new SimpleDateFormat(patern2, new Locale("jp", "JP"));

        String strDate = "25-09-1995";

        Date date = new Date();
        System.out.println("String --->  Date : ");
        System.out.println(df1.parse(strDate));
        System.out.println(df2.format(df1.parse(strDate)));
        System.out.println("------------");
        System.out.println("Date --->  String : ");
        System.out.println(df1.format(date));

    }
}
