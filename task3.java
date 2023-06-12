import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = Scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = Scanner.next();

        System.out.print("Введите второе число: ");
        double num2 = Scanner.nextDouble();

        Scanner.close();
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}