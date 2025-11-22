public class TailRecursionTest {
    public static long tailRecursive(long n, long accumulator) {
        if (n == 0) {
            return accumulator; 
        } else {
            return tailRecursive(n - 1, n + accumulator);
        }
    }

    public static long nonTailRecursive(long n) {
        if (n == 0) {
            return 0;
        } else {
            return n + nonTailRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        long depth = 1_000_000L;

        System.out.println("Testing tail-recursive version...");
        try {
            long result = tailRecursive(depth, 0);
            System.out.println("tailSum completed: " + result);
        } catch (StackOverflowError e) {
            System.out.println("tailSum caused StackOverflowError");
        }

        System.out.println("Testing non-tail-recursive version...");
        try {
            long result = nonTailRecursive(depth);
            System.out.println("nonTailSum completed: " + result);
        } catch (StackOverflowError e) {
            System.out.println("nonTailSum caused StackOverflowError");
        }
    }
}
