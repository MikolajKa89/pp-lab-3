package geometry;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    public Prostokat(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double obliczPole() {
        return dlugosc * szerokosc;
    }

    public double obliczObwod() {
        return 2 * (dlugosc + szerokosc);
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }
}
