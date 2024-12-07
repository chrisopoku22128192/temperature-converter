import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Converter!");
         
        Scanner scanner = new Scanner(System.in); // this creates a scanner object to take input from the user
        
        System.out.println("1. Convert Celsius to Fahrenheit"); //this displays menu options to the user for temperature conversion
        System.out.println("2. Convert Fahrenheit to Celsius");
        
        System.out.print("Enter your choice (1 or 2): "); //promts the user to enter their choice for conversion
        int choice = scanner.nextInt();

        if (choice == 1) { //creates a loop until valid input is entered
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice."); //if the user enters an invalid choice, displays an error message
        }

        scanner.close();
    }

    }
