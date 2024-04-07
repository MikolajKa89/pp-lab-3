public class package geometry {
    
public class Main {

    public static void main(String[] args) {
        Point center = new Point(1,5, 3,2);
        double radius = 5;

        Circle circle = new Circle(center, radius);

        System.out.println("Właściwości koła:");
        System.out.println("Środek: " + circle.getCenter());
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni: " + circle.getArea());
    }

}