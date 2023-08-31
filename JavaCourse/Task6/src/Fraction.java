public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void showFraction() {
        System.out.println("Дробь в формате x / y: " + numerator + " / " + denominator);
    }

    public double addFraction(double fraction) {
        double additionResult = (double) numerator / denominator + fraction;
        return additionResult;
    }

    public double multiplyFraction(double fraction) {
        double multiplicationResult = (numerator * fraction) / denominator;
        return multiplicationResult;
    }

    public double divideFraction(double fraction) {
        double dividingResult = numerator /fraction / denominator;
        return dividingResult;
    }
}
