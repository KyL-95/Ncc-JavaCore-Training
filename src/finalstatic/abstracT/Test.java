package finalstatic.abstracT;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cho c1 = new Cho();
        Meo m1 = new Meo();
        SucVat s1 = new Meo();
        SucVat s2 = new Cho();

        System.out.print("SucVat s1 sleep: ") ; s1.sleep();
        System.out.print("SucVat s1 biThit: "); s1.biThit();
        System.out.print("SucVat s2 biThit: "); s2.biThit();

        System.out.println("-------------");
        System.out.print("Cho c1 biThit: ");    c1.biThit();
        System.out.print("Meo m1 biThit: ");    m1.biThit();
        System.out.println(c1.soChan);

    }
}
