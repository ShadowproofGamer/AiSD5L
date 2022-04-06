public class Pracownik implements Comparable<Pracownik> {
    public long pesel;
    public String nazwIm;
    public String dataUr;
    public String stanowisko;
    public double pensja;
    public int staz;
    public double premia = 0;

    public Pracownik(long pesel, String nazwIm, String dataUr, String stanowisko, int pensja, int staz) {
        this.pesel = pesel;
        this.stanowisko = stanowisko;
        this.dataUr = dataUr;
        this.pensja = pensja;
        this.nazwIm = nazwIm;
        this.staz = staz;
        if (staz >= 20) this.premia = pensja * 0.2;
        else if (staz >= 10) this.premia = pensja * 0.1;

    }
    public Pracownik(String pesel, String nazwIm, String dataUr, String stanowisko, int pensja, int staz) {
        this.pesel = Long.parseLong(pesel);
        this.stanowisko = stanowisko;
        this.dataUr = dataUr;
        this.pensja = pensja;
        this.nazwIm = nazwIm;
        this.staz = staz;
        if (staz >= 20) this.premia = pensja * 0.2;
        else if (staz >= 10) this.premia = pensja * 0.1;

    }

    @Override
    public String toString() {
        return String.format("%011d %-20s %-12s %-12s %-8.2f %-2d %-8.2f", pesel, nazwIm, dataUr, stanowisko, pensja, staz, premia);
                /*"Pracownik{" +
                "pesel=" + pesel +
                ", nazwIm='" + nazwIm + '\'' +
                ", dataUr='" + dataUr + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", pensja=" + pensja +
                ", staz=" + staz +
                ", premia=" + premia +
                '}';
                */
    }

    @Override
    public int compareTo(Pracownik o) {
        return Long.compare(pesel, o.pesel);
    }
}
