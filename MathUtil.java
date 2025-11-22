public class MathUtil {
    
    public int Max(int a, int b) {
        return (a > b) ? a : b;
    }

    public double Max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        MathUtil mu = new MathUtil();
        System.out.println("Max of 3 and 5 (int): " + mu.Max(3, 5));
        System.out.println("Max of 3.5 and 2.5 (double): " + mu.Max(3.5, 2.5));
    }
}
