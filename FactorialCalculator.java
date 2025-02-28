import java.util.Scanner;
public class FactorialCalculator {

    public static int getNonNegativeInteger() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non negative integer: ");
        int n = input.nextInt();
        return n;
    }

    public static void calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
           result = result * i;
        }
        System.out.println("The factorial of " + n + " is: " + result + "\n");
    }

    public static void main(String[] args) {
        calculateFactorial(getNonNegativeInteger()); 
        calculateFactorial(getNonNegativeInteger()); 
    }
}
