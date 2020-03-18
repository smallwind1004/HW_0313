/**
 * HW_01 sin => toRadians tri area => a*b*sin(C)/2 tri perimter = > c^2 = a^2 +
 * b^2 -2a*b*cos(C)
 */
public class HW_01 {

    public static void main(String[] args) {
        Shape shape1 = new Shape(12.98);
        Shape shape2 = new Shape(3.5, 4.5);
        Shape shape3 = new Shape(3.0, 4.0, 90);

        System.out.println(shape1.getPerimeter());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape3.getPerimeter());
        System.out.println(shape1.getArea());
        System.out.println(shape2.getArea());
        System.out.println(shape3.getArea());
        System.out.println(Shape.getCount());
    }
}