public class task2 {
    // Нахождение простых чисел в пределах от 2 до 1000

    public static void main(String args[]) {
        int i, j;
        boolean prime;
        for (i = 1; i < 1000; i++) {
            prime = true;
            //  делится ли число без остатка
            for (j = 2; j <= i / j; j++)
                // если число делится без остатка, значит, оно не простое
                if ((i % j) == 0)
                    prime = false;
            if (prime)
                System.out.printf("%d - простое число.\n", i);

        }
    }
}
