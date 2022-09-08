import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator App ^^");

        // Using scanner.nextInt() to get input as an integer from the keyboard
        // Using calculator to perform operations
        Calculator calculator = new Calculator();

        /* Your code here */
        boolean running = true;
        while(running){
            Scanner scanner = new Scanner(System.in);
            int type = scanner.nextInt();
            if (type == 0){
                System.out.println("Exiting calculator");
                running = false;
            } else if (type == 1){
                System.out.println("Enter your number below");
                int x = scanner.nextInt();
                int y = scanner.nextInt();                
                int ret = calculator.add(x, y);
                System.out.println("Result: " + ret);
            } else if (type == 2) {
                System.out.println("Enter your number below");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                int ret = calculator.subtract(x, y);
                System.out.println("Result: " + ret);
            } else if (type == 3) {
                System.out.println("Enter your number below");

                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                int ret = calculator.multiple(x, y);
                System.out.println("Result: " + ret);
            } else if (type == 4) {
                System.out.println("Enter your number below");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                float ret = calculator.divide(x, y);
                System.out.println("Result: " + ret);
            } else {
                System.out.println("Operator not supported!");
            }
        }
    }
}
