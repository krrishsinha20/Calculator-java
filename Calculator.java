// Calculator.java

public class Calculator {
    public double add(double a, double b) { return a + b; }
    public double subtract(double a, double b) { return a - b; }
    public double multiply(double a, double b) { return a * b; }
    public double divide(double a, double b) { return (b != 0) ? a / b : Double.NaN; }
    
    public long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
    public double sumArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }
    
    public double mean(double[] array) {
        return sumArray(array) / array.length;
    }
    
    public double variance(double[] array) {
        double mean = mean(array);
        double sum = 0;
        for (double num : array) {
            sum += Math.pow(num - mean, 2);
        }
        return sum / array.length;
    }
    
    public double standardDeviation(double[] array) {
        return Math.sqrt(variance(array));
    }
}
