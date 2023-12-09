public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to

        System.out.println(s1); //
        System.out.println(s1.GetArea()); //
        System.out.println(s1.GetPerimeter()); //
        System.out.println(s1.GetColor());
        System.out.println(s1.IsFilled());
        //System.out.println(s1.GetRadius());
        Circle c1 = (Circle)s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        System.out.println(c1.IsFilled());
        System.out.println(c1.GetRadius());

    }
}