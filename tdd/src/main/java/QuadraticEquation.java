public class QuadraticEquation {

    public static double[] solve(double a, double b, double c) {
        if (a == 0) {
            throw new ArithmeticException("'a' can't be zero");
        }
        final var d = b * b - 4 * a * c;
        if (d > 0) {
            final var x1 = (-b - Math.sqrt(d)) / (2 * a);
            final var x2 = (-b + Math.sqrt(d)) / (2 * a);
            return new double[]{x1, x2};
        } else if (d == 0) {
            final var x = -b / (2 * a);
            return new double[]{x};
        } else {
            return new double[0];
        }
    }

}
