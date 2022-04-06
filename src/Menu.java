import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class Menu {

    DataBase db;

    public Menu() {

    }

    boolean dbCreation() {
        db = new DataBase();
        return true;
    }

    Pracownik peselPracownikConverter(int pesel) throws NoWorkerFoundException {
        Iterator<Pracownik> it = db.iterator();
        while (it.hasNext()) {
            Pracownik p = it.next();
            if (p.pesel == pesel) return p;
        }
        throw new NoWorkerFoundException();
    }

    boolean readFromFile() {
        try(
                FileInputStream fis = new FileInputStream("src/txt.bin");
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            int l = ois.readInt();
            for(int k=0;k<l;k++){
                db.add((Pracownik) ois.readObject());
            }
            return true;
        }
        catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    void printDB() {
        Iterator<Pracownik> it = db.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }

    void printOne(int pesel) {
        //Iterator<Pracownik> it = db.iterator();
        //while (it.hasNext()) {
        //    Pracownik p = it.next();
        //    if (p.pesel == pesel) System.out.println(p);
        //}
        try {
            Pracownik p = peselPracownikConverter(pesel);
            System.out.println(p);
        } catch (NoWorkerFoundException e) {
            System.out.println("Nie znaleziono takiego pracownika");
        }
    }

    boolean removeOne(int pesel) {
        try {
            Pracownik p = peselPracownikConverter(pesel);
            return db.remove(p);
        } catch (NoWorkerFoundException e) {
            System.out.println("Nie znaleziono takiego pracownika");
            return false;
        }

    }

    boolean updateOne(int pesel) {
        try {
            Pracownik p = peselPracownikConverter(pesel);

            return true;
        } catch (NoWorkerFoundException e) {
            System.out.println("Nie znaleziono takiego pracownika");
            return false;
        }
    }

    double averageSalary() {
        double sum = 0;
        double amount = 0;
        Iterator<Pracownik> it = db.iterator();
        while (it.hasNext()) {
            Pracownik p = it.next();
            sum += p.pensja;
            amount++;
        }
        if (amount > 0) return sum / amount;
        else return 0;
    }

    int belowAverageSalary() {
        double average = averageSalary();
        int below = 0;
        Iterator<Pracownik> it = db.iterator();
        while (it.hasNext()) if (it.next().pensja < average) below++;
        return below;
    }

    boolean writeToFile() {
        try (
                FileOutputStream fos = new FileOutputStream("src/txt.bin");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            int j = db.size();
            oos.writeInt(j);
            Iterator<Pracownik> it = db.iterator();
            while (it.hasNext()) {
                oos.writeObject(it.next());
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
