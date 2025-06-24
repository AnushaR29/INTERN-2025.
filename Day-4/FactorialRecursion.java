public class FactorialRecursion {
    
    // Recursive method to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // base case
        } else {
            return n * factorial(n - 1);  // recursive call
        }
    }

    public static void main(String[] args) {
        int number = 5;  // Input
        int result = factorial(number);  // Calling recursive function
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
