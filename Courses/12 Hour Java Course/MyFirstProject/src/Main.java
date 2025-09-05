import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // \n Allows line separation, and is the same as 'println' or 'print line'

        System.out.print("Nano Banana\n");
        System.out.println("The best AI model for images");
        System.out.println("Very cheap!");

        /* This is a
        multi-line comment
         */


        // A variable is a reusable container for a value. It acts as if it was the value it contains.
        // 🟥 Primitive = simple value stored directly in memory (stack) : int, double, char, boolean
        // 🟦 Reference = memory address (stack) that points to the (heap) : string, array, object
        // You create a variable with declaration or assignment.

        // Primatives
        int year = 2025;
        int ageOld = 21;
        int quantity = 1;

        double price = 19.55;
        double GPAOld = 2.85;
        double temperature = 12.5;

        char grade = 'B';
        char symbol = '!';
        char currency = '$';

        boolean forSale = false;
        boolean isOnline = true;

        System.out.println("The year is " + year);
        System.out.println("THe price is " + currency + price);
        if (isOnline){
            System.out.println("You are online");
        }
        else{
            System.out.println("You are not online");
        }

        // References
        String nameOld = "Raphael";
        String email = "fakeemail123@gmail.com";
        System.out.println("Your name is " + nameOld);
        System.out.println("Your email is " + email);
        System.out.println("Your are " + ageOld + " years old");
        System.out.println("Your GPA is " + GPAOld + " and your average letter grade is: " + grade);

        // Scanners are used to read inputs, in this case text input

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.print("Are you a student (true/false): ");
            boolean student = scanner.nextBoolean();

            if (student){
                System.out.print("What is your GPA: ");
                double GPA = scanner.nextDouble();
                if (GPA > 3.8){
                    System.out.println("Welcome to Pratt!");
                }
                else{
                    System.out.println("Good luck in Trinity");
                }
            }
            else {
                System.out.println("Time to find a job!");
            }
            }
        else{
                System.out.println("Enjoy highschool!");
            }




        scanner.close();



    }
}
