public class Main{
public static void main(String[] args) {
        System.out.println("isPrime(7): " + MathUtil.isPrime(7));
        System.out.println("gcd(54, 24): " + MathUtil.gcd(54, 24));
        System.out.println("lcm(5, 10): " + MathUtil.lcm(5, 10));
        System.out.println("fibonacci(10): " + MathUtil.fibonacci(10));
        System.out.println("factorial(5): " + MathUtil.factorial(5));

        MathUtil util = new MathUtil();
        System.out.println("isPerfectNumber(6): " + util.isPerfectNumber(6));
        System.out.println("sumOfDigits(1234): " + util.sumOfDigits(1234));
        System.out.println("reverseNumber(4325): " + util.reverseNumber(4325));
        System.out.println("isArmstrongNumber(153): " + util.isArmstrongNumber(153));
        System.out.println("nextPrime(8): " + util.nextPrime(8));
    }
}