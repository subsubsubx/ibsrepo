package firstproj;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author duce - @see Task1#calc - принимает на вход два числа типа double - numb1 и numb2,
 * а также строку (вид операции): "+", "-", "*" или "/"
 * В случае ввода невалидных данных программа останавливается и выбрасывает в консоль ошибку с предупреждением
 */

public class Task1 {
    public static void main(String[] args) {
        calc(); // вызов метода
    }

    public static void calc() throws InputMismatchException {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите первое число:");
            double numb1 = scan.nextDouble();
            System.out.println("Введите второе число:");
            double numb2 = scan.nextDouble();
            System.out.println("Укажите тип операции: '+', '-', '*' или '/'");
            String op = scan.next();
            switch (op) {
                case "+":
                    System.out.printf("%.4f", (numb1 + numb2));
                    break;
                case "-":
                    System.out.printf("%.4f", (numb1 - numb2));
                    break;
                case "*":
                    System.out.printf("%.4f", (numb1 * numb2));
                    break;
                case "/":
                    if (numb2 == 0) { // проверяем деление на 0
                        System.out.println("Делить на ноль нельзя!");
                    } else {
                        System.out.printf("%.4f", (numb1 / numb2));
                    }
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Невалидные данные!"); // выбрасываем в консоль текст с ошибкой
        }
        scan.close();
    }
}