import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose operation: + - * /");
        char op = sc.next().charAt(0);

        int result = 0;

        switch (op) {
            case '+':
                result = calc.add(a, b);
                System.out.println("add operation done");
                break;
            case '-':
                result = calc.subtract(a, b);
                System.out.println("subraction operation done");
                break;
            case '*':
                result = calc.multiply(a, b);
                System.out.println("multiply operation done");
                break;
            case '/':
                result = calc.divide(a, b);
                System.out.println("divide operation done");
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }

        System.out.println("Result: " + result);
        System.out.println("your calcualtion is done thank you");
    }
}
