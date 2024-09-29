public class MathUtil {
    /**
     * Checks whether a given number n is prime.
     * @param n the number to check
     * @return true if n is prime, otherwise false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Calculates the greatest common divisor (GCD) of two integers using the Euclidean algorithm.
     * @param a first number
     * @param b second number
     * @return the GCD of a and b
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     * Computes the least common multiple (LCM) of two numbers.
     * @param a first number
     * @param b second number
     * @return the LCM of a and b
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    /**
     * Returns the nth Fibonacci number (0, 1, 1, 2, 3, 5, ...).
     * @param n the position in the Fibonacci sequence
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b; // F(n) = F(n-1) + F(n-2)
            a = b;
            b = c;
        }
        return b;
    }

    /**
     * Calculates the factorial of a number n (i.e., n!).
     * @param n the number
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n < 0) return -1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Determines if the given number n is a perfect number (sum of its divisors excluding itself).
     * @param n the number to check
     * @return true if n is a perfect number, otherwise false
     */
    public boolean isPerfectNumber(int n) {
        if (n < 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    /**
     * Computes the sum of the digits of the given number n.
     * @param n the number
     * @return the sum of the digits of n
     */
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Reverses the digits of a number n.
     * @param n the number to reverse
     * @return the number formed by reversing the digits of n
     */
    public int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    /**
     * Checks if a number is an Armstrong number (sum of its own digits each raised to the power of the number of digits).
     * @param n the number to check
     * @return true if n is an Armstrong number, otherwise false
     */
    public boolean isArmstrongNumber(int n) {
        int originalNumber = n, sum = 0, digits = 0;
        while (n != 0) {
            digits++;
            n /= 10;
        }
        n = originalNumber;
        while (n != 0) {
            sum += Math.pow(n % 10, digits);
            n /= 10;
        }
        return sum == originalNumber;
    }

    /**
     * Finds the smallest prime number greater than n.
     * @param n the number
     * @return the next prime number after n
     */
    public int nextPrime(int n) {
        int next = n + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }
}
