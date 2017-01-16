/**
 * Created by student1 on 16.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Figure triangle = new Figure() {
            @Override
            public double getArea(double a, double b, double c) {
                return a*b*c;
            }

            @Override
            public double getPerimeter(double a, double b, double c) {
                return 2*a+2*b;
            }
        };
        Figure rectangle = new Figure() {
            @Override
            public double getArea(double a, double b, double c) {
                double p = getPerimeter(a, b, c)*2;
                return Math.sqrt(p*(p-a)*(p-b)*(p-c));
            }

            @Override
            public double getPerimeter(double a, double b, double c) {
                return a+b+c;
            }
        };

        Figure [] fArr = {rectangle, triangle};
        for (Figure f:fArr
             ) {
            System.out.println(f.getArea(1, 2, 5));
        }

    }
}
