pakiet geometria;

public class KolowyKolorowy extends Kolo {
    private String kolor;

    public KolowyKolorowy(double promien, String kolor) {
        super(promien);
        this.kolor = kolor;
    }

    public String pobierzKolor() {
        return kolor;
    }
}
