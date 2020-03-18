public class Shape {
    private double r = 0, de = 0, a = 0, b = 0;
    private static int count = 0;

    public Shape(double radious) {
        setCircle(radious);
        count++;
    }

    public Shape(double w, double h) {
        setRectangle(w, h);
        count++;
    }

    public Shape(double a, double b, double degree) {
        setTriangle(a, b, degree);
        count++;
    }

    public void setCircle(double radious) {
        this.r = radious;
    }

    public void setRectangle(double w, double h) {
        this.a = w;
        this.b = h;
    }

    public void setTriangle(double a, double b, double degree) {
        this.a = a;
        this.b = b;
        this.de = Math.toRadians(degree);
    }

    public double getPerimeter() {
        if (r != 0) {
            return 2 * r * Math.PI;
        } else {
            if (de == 0) {
                return 2 * (a + b);
            } else {
                return a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(de));
            }
        }
    }

    public double getArea() {
        if (r != 0) {
            return r * r * Math.PI;
        } else {
            if (de == 0) {
                return a * b;
            } else {
                return a * b * Math.sin(de) / 2;
            }
        }
    }

    public static int getCount() {
        return count;
    }
}