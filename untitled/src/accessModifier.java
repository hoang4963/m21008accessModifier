public class accessModifier {
    public static void main(String[] args) {
        circle circle1 = new circle();
        circle circle2 = new circle(2.5);
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
    }
}
