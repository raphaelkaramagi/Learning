import java.util.Scanner;

public class tip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bill amount: ");
        double billAmount = sc.nextDouble();

        System.out.println("Enter the tip percentage: ");
        double tipPercentage = sc.nextInt();

        double tipAmount = billAmount * tipPercentage / 100;
        System.out.println("The tip amount is: " + tipAmount);
    }
}