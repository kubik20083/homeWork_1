// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a = iScanner.nextInt();
        System.out.printf("N-ое треугольного числа: %d\n", getNumber(a));
        System.out.printf("N! = %d\n",getFactorial(a));
        iScanner.close();
    }

    public static int getNumber(int x) {
        return (x * (x + 1)) / 2;
    }
        
    public static int getFactorial(int f) {
  int result = 1;
  for (int i = 1; i <= f; i++) {
     result = result * i;
  }
  return result;
}
}
