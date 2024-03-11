public class ActivationFunction {
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x > 0) return 1;
        else if (x == 0) return 0.5;
        else return 0;
    };
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) { return Double.NaN; }
        return 1 / (1 + Math.exp(-x));
    }
    public static double tanh(double x) {
        if (Double.isNaN(x)) { return Double.NaN; }
        if (x >= 20) { return 1.0; }
        if (x <= -20) { return -1.0; }
        double ex = Math.exp(x);
        double emx = Math.exp(-x);
        return (ex - emx) / (ex + emx);
    }
    public static double softsign(double x) {
        if (Double.isNaN(x)) { return Double.NaN; }
        if (x == Double.POSITIVE_INFINITY) { return 1; }
        if (x == Double.NEGATIVE_INFINITY) { return -1; }
        return x / (1 + Math.abs(x));
    }
    public static double sqnl(double x) {
        if (Double.isNaN(x)) { return Double.NaN; }
        if (x <= -2) { return -1; }
        else if (-2 < x && x < 0) { return x + (x * x / 4); }
        else if (0 <= x && x < 2) { return x - (x * x / 4); }
        else { return 1; }
    }
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("heaviside(%s): %s\n", x, heaviside(x));
        StdOut.printf("sigmoid(%s): %s\n", x, sigmoid(x));
        StdOut.printf("tanh(%s): %s\n", x, tanh(x));
        StdOut.printf("softsign(%s): %s\n", x, softsign(x));
        StdOut.printf("sqnl(%s): %s\n", x, sqnl(x));
    }
}
