import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //testy:
        Pracownik a = new Pracownik("32134567890", "Kowalski Jan", "04.02.2002", "kierownik", 3000, 10);
        Pracownik b = new Pracownik("02134567890", "Kowalski Maciej", "04.02.2002", "księgowy", 3000, 9);
        Pracownik c = new Pracownik("07134567890", "Kowalski Karol", "04.02.2002", "księgowy", 3000, 9);
        Pracownik d = new Pracownik("22134567890", "Kowalski Andrzej", "04.02.2002", "księgowy", 3000, 9);
        Pracownik e = new Pracownik("72134567890", "Kowalski Czesław", "04.02.2002", "księgowy", 3000, 9);

        //TODO testy programu i symulacja parkingu

        //ArrayList<Pracownik> testarr= new ArrayList<>();
        //TwoWayCycledListWithSentinel<Pracownik> testtwc = new TwoWayCycledListWithSentinel<>();
        //testy 1:
        //testarr.add(a);
        //testarr.add(b);
        //testtwc.add(a);
        //testtwc.add(b);
        //System.out.println(testarr);
        //Collections.sort(testarr);
        //System.out.println(testarr);
        //System.out.println(a.compareTo(b));
        //Iterator<Pracownik> it = testtwc.iterator();
        //while (it.hasNext())System.out.println(it.next());
        //System.out.println(testtwc);

        //testy 2:
        //DataBase db = new DataBase();
        //db.add(a);
        //db.add(b);
        //Iterator<Pracownik> it = db.iterator();
        //while (it.hasNext())System.out.println(it.next());
        //db.add(c);
        //Iterator<Pracownik> it2 = db.iterator();
        //while (it2.hasNext())System.out.println(it2.next());
        //db.add(d);
        //Iterator<Pracownik> it3 = db.iterator();
        //while (it3.hasNext())System.out.println(it3.next());
        //db.add(e);
        //Iterator<Pracownik> it4 = db.iterator();
        //while (it4.hasNext())System.out.println(it4.next());
    }
}
