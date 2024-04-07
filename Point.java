public class Point {

    private double x;
    private double y;
  
    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }
  
    public double getX() {
      return x;
    }
  
    public void setX(double x) {
      this.x = x;
    }
   
    public double getY() {
      return y;
    }
  
    public void setY(double y) {
      this.y = y;:
    }
   
    public static double distance(Point p1, Point p2) {
      return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }
  
  }
  
  public class Main {
  
    public static void main(String[] args) {
      Point p1 = new Point(1, 1);
      Point p2 = new Point(4, 5);
  
      double distance = Point.distance(p1, p2);
      System.out.println("Odległość między punktami (" + p1.getX() + ", " + p1.getY() + ") i (" + p2.getX() + ", " + p2.getY() + ") wynosi: " + distance);
    }
  
  }
  ddfd