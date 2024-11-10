public class EuclidAlgorithm {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        int result = gcd(48, 18); // Example usage
        System.out.println("The GCD is: " + result);
    }
}