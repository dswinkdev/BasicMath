import java.text.DecimalFormat;
import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat commas = new DecimalFormat("#,###.##");
        double result = 0;

        // declaring 2 arguments for user input
        double[] arguments = new double[2];

        intro();
        menu();

        while (true) {
            System.out.print("Enter menu option: ");
            int menuPress = scan.nextInt();
            switch (menuPress) {
                case 1:
                    System.out.println("\nLet's add! (+)");
                    getUserInput(arguments);
                    result = addition(arguments[0], arguments[1]);
                    System.out.println("\nanswer: " + commas.format(result) + "\n");
                    break;
                case 2:
                    System.out.println("\nLet's subtract! (-)");
                    getUserInput(arguments);
                    result = subtraction(arguments[0], arguments[1]);
                    System.out.println("\nanswer: " + commas.format(result) + "\n");
                    break;
                case 3:
                    System.out.println("\nLet's multiply! (*)");
                    getUserInput(arguments);
                    result = multiplication(arguments[0], arguments[1]);
                    System.out.println("\nanswer: " + commas.format(result) + "\n");
                    break;
                case 4:
                    System.out.println("\nLet's divide! (/)");
                    getUserInput(arguments);
                    if (arguments[1] == 0) {
                        System.out.println("Error: Division by zero is undefined.\n");
                    } else {
                        result = division(arguments[0], arguments[1]);
                        System.out.println("\nanswer: " + commas.format(result) + "\n");
                    }
                    break;
                case 5:
                    System.out.println("\nProgram has ended.");
                    return;
                default:
                    System.out.println("Invalid menu option\n");
                    break;
            }
        }
    }

    public static double[] getUserInput(double[] arguments) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        arguments[0] = scan.nextDouble();
        System.out.print("Enter second number: ");
        arguments[1] = scan.nextDouble();
        return arguments;
    }

    public static double addition(double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    public static double subtraction(double firstNum, double secondNum){
        return firstNum - secondNum;
    }

    public static double multiplication(double firstNum, double secondNum){
        return firstNum * secondNum;
    }

    public static double division(double firstNum, double secondNum){
        return firstNum / secondNum;
    }

    public static void intro(){
        System.out.println("\n\t ✨📚🏆📚✨");
        System.out.println("+-*/ Basic Math /*-+");
        System.out.println("---------------------");
    }

    public static void menu(){
        System.out.println("press 1) (+) Addition");
        System.out.println("press 2) (-) Subtraction");
        System.out.println("press 3) (*) Multiplication");
        System.out.println("press 4) (/) Division");
        System.out.println("press 5) Exit Program\n");
    }
}