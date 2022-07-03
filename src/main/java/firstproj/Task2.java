package firstproj;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author subsubsubx
 * @see #calc() - калькулятор
 * @see #maxlength() - максимальное слово в массиве
 *
 */


public class Task2 {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите режим: 1 - калькулятор, 2 - поиск максимального слова в массиве");
        int count = 0;
        while (count != 1) {
            try {
                int mode = scanner.nextInt();
                switch (mode) {
                    case 1:
                        calc();
                        count++;
                        break;
                    case 2:
                        maxlength();
                        count++;
                        break;
                    default:
                        System.out.println("Режима с номером " + mode + " не существует! Выберите 1 или 2");
                        return;
                }
                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Неверные данные!");
                break;
            }
        }
    }

    public static void calc() {
        Scanner scan = new Scanner(System.in);
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
                    break;
                } else {
                    System.out.printf("%.4f", (numb1 / numb2));
                    break;
                }
            default:
                System.out.println("Неверный знак операции!");
        }
        scan.close();
    }

    public static void maxlength() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во слов:");
        int count = 0;
        while (count != 1) {
            int size = scan.nextInt(); // кол-во
            if (size <= 0) {
                System.out.println("Количество слов не может равняться нулю или принимать отрицательное значение, попробуйте еще раз:");
            } else {
                String maxword = "";
                String[] words = new String[size];
                for (int i = 0; i < size; i++) {
                    System.out.println("Введите слово " + (i + 1));
                    words[i] = scan.next();
                    if (words[i].length() >= maxword.length()) {
                        maxword = words[i];
                    }
                }
                System.out.println("Самое длинное слово: " + maxword);
                scan.close();
                count++;
            }
        }
    }
}

