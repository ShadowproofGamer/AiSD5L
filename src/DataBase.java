import java.util.Iterator;
import java.util.ListIterator;

public class DataBase extends TwoWayCycledListWithSentinel<Pracownik>{
    public DataBase(){
        super();
    }
    @Override
    public boolean add(Pracownik value) {
        //System.out.println("add1");
        ListIterator<Pracownik> it = listIterator();
        if (this.isEmpty()){
            System.out.println("add3  " + value.pesel);
            it.add(value);
            return true;
        }
        else if (size()==1){
            System.out.println("add4  " + value.pesel);
            it.add(value);
            return true;
        }
        while (it.hasNext()){
            System.out.println("add2  " + value.pesel);
            if (it.next().pesel> value.pesel){
                System.out.println("added  " + value.pesel);
                it.previous();
                it.add(value);
                return true;
            }
        }
        super.add(value);
        return true;
    }
}
