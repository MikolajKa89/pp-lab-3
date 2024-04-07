pakiet pakietglowny;

import geometry.Prostokat;

public class Glowna {
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(5.0, 3.0);
        System.out.println("Długość: " + prostokat.getDlugosc());
        System.out.println("Szerokość: " + prostokat.getSzerokosc());
        System.out.println("Pole: " + prostokat.obliczPole());
        System.out.println("Obwód: " + prostokat.obliczObwod());
    }
}
