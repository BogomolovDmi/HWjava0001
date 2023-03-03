// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HWjava0001;

import java.util.Scanner;

public class HWJAVA01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long sumN = 0;
        long sumfact = 1;
        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
            sumfact = sumfact  * i;
           
        }
       
        System.out.println("n-ое треугольного число(сумма чисел от 1 до n): " + sumN);
        System.out.println("n! (произведение чисел от 1 до n): " + sumfact);
        
    }
}

