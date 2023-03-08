package Cau1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        System.out.println("-Chu vi hình tròn: " + c1.getArea());
        System.out.println("-Diện tích hình tròn: " + c1.getCircumference());

        Circle c2 = new Circle(-3);
        System.out.println("Chu vi hình tròn: " + c2.getArea());
        System.out.println("Diện tích hình tròn: " + c2.getCircumference());
    }
}
