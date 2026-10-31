
public class NumberAnalyzer {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int j = 2; j <= n / j; j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverse(int n) {
        long number = Math.abs((long) n);
        long reversed = 0;

        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        if (n < 0) {
            reversed = -reversed;
        }

        if (reversed < Integer.MIN_VALUE ||
            reversed > Integer.MAX_VALUE) {
            throw new ArithmeticException(
                "Reversed number exceeds integer range"
            );
        }

        return (int) reversed;
    }

    public static boolean isPalindrome(int n) {
        try {
            return reverse(n) == n;
        } catch (ArithmeticException e) {
            return false;
        }
    }

    public static void analyze(int n) {
        System.out.println("Number: " + n);

        System.out.println(
            "Parity: " + (isEven(n) ? "Even" : "Odd")
        );

        String sign = isPositive(n) ? "Positive"
                : n == 0 ? "Zero" : "Negative";

        System.out.println("Sign: " + sign);

        System.out.println(
            "Divisible by 3: " + isDivisibleBy3(n)
        );

        System.out.println("Prime: " + isPrime(n));

        try {
            System.out.println("Reverse: " + reverse(n));
        } catch (ArithmeticException e) {
            System.out.println("Reverse: Overflow");
        }

        System.out.println(
            "Palindrome: " + isPalindrome(n)
        );

        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(
                "Usage: java NumberAnalyzer <number1> <number2> ..."
            );
            return;
        }

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                analyze(number);
            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid integer: " + arg
                );
                System.out.println("------------------------");
            }
        }
    }
}
