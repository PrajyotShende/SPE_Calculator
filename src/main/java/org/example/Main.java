    package org.example;
    import java.util.Scanner;
    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main
    {
        public static void main(String[] args)
        {
            if (args.length > 0 && args[0].equalsIgnoreCase("noninteractive")) {
                System.out.println("Running in non-interactive mode. Exiting...");
                return;
            }
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                System.out.println("Scientific Calculator Menu:");
                System.out.println("1. Square Root");
                System.out.println("2. Factorial");
                System.out.println("3. Natural Logarithm");
                System.out.println("4. Power Function");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
    //
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter a number: ");
                        double num = scanner.nextDouble();
                        System.out.println("Square Root: " + Math.sqrt(num));
                        break;
                    case 2:
                        System.out.print("Enter an integer: ");
                        int n = scanner.nextInt();
                        System.out.println("Factorial: " + factorial(n));
                        break;
                    case 3:
                        System.out.print("Enter a number: ");
                        double x = scanner.nextDouble();
                        System.out.println("Natural Log: " + Math.log(x));
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exponent = scanner.nextDouble();
                        System.out.println("Power: " + Math.pow(base, exponent));
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
        }

        public static long factorial(int n)
        {
            if (n < 0)
            {
                throw new IllegalArgumentException("Negative numbers not allowed.");
            }
            long result = 1;
            for (int i = 1; i <= n; i++)
            {
                result *= i;
            }
            return result;
        }
    }