import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option: ");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                celsiusToFahrenheit();
                break;
            case 2:
                fahrenheitToCelsius();
                break;
            case 3:
                celsiusToKelvin();
                break;
            case 4:
                kelvinToCelsius();
                break;
            case 5:
                fahrenheitToKelvin();
                break;
            case 6:
                kelvinToFahrenheit();
                break;
            default:
                System.out.println("Invalid option!");
        }

        scanner.close();
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }

    public static void celsiusToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;
        System.out.println("Temperature in Kelvin: " + kelvin);
        scanner.close();
    }

    public static void kelvinToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double celsius = kelvin - 273.15;
        System.out.println("Temperature in Celsius: " + celsius);
        scanner.close();
    }

    public static void fahrenheitToKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("Temperature in Kelvin: " + kelvin);
        scanner.close();
    }

    public static void kelvinToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}
