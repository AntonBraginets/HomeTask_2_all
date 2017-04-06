import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task_2_1();
        Task_2_2();
        Task_2_3_if();
        Task_2_3_tern();
        Task_2_3_tern_error();
        Task_2_4_if();
        Task_2_4_if_test();
        Task_2_4_tern();
        Task_2_5_tern();
        Task_2_6();
        Task_2_7();
        Task_2_8();
        Task_2_9();
    }

    private static void Task_2_1() {
        System.out.println("Задание 2.1");
        System.out.println("Введите, пожалуйста, значения числителя и знаменателя дроби для нахождения частного: ");
        System.out.print("\nЧислитель: ");
        Scanner sc = new Scanner(System.in);
        double chisl = sc.nextDouble();
        System.out.print("Знаменатель: ");
        double znam = sc.nextDouble();
        if (znam == 0) {
            System.out.println("\nРешений нет, поскольку знаменатель равен нулю!");
        } else {
            double quotient = chisl / znam;
            System.out.println("\nОтвет: " + quotient);
        }
    }

    private static void Task_2_2() {
        System.out.println("\nЗадание 2.2");
        System.out.print("Введите, пожалуйста, дату основания Одессы: ");
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        if (date != 1974)
            System.out.println("\nВы ощиблись, Одесса была основана в 1974 году.");
        else
            System.out.println("\nВерно! Одесса была основана в 1974 году.");
    }

    private static void Task_2_3_if() {
        System.out.println("\nЗадание 2.3 (if-else)");
        System.out.println("Программа рассчета стоимости покупки с учетом скидки.");
        System.out.print("\nВведите, пожалуйста, стоимость покупки: ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        if (sum < 500) {
            double discount1 = 0;
            System.out.println("ИТОГО к оплате: " + sum + " грн (скидка составила: " + discount1 + "%)");
        } else if (sum >= 500 && sum < 1000) {
            double discount2 = 0.03;
            sum = sum * (1 - discount2);
            System.out.println("ИТОГО к оплате: " + sum + " грн (скидка составила: " + discount2 * 100 + "%)");
        } else {
            double discount3 = 0.05;
            sum = sum * (1 - discount3);
            System.out.println("ИТОГО к оплате: " + sum + " грн (скидка составила: " + discount3 * 100 + "%)");
        }
    }

    private static void Task_2_3_tern() {
        System.out.println("\nЗадание 2.3 (tern)");
        System.out.println("Программа рассчета стоимости покупки с учетом скидки.");
        System.out.print("\nВведите, пожалуйста, стоимость покупки: ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble();
        int discount = (sum >= 1000) ? 95 : (sum >= 500) ? 97 : (sum > 0) ? 100 : 0;
        double finalSum = sum * discount / 100;
        System.out.println("\nВаша скидка составляет: " + (100 - discount) + "%.");
        System.out.println("Общая сумма Вашей покупки с учетом скидки составляет: " + finalSum + " грн.");
    }

    private static void Task_2_3_tern_error() {
        System.out.println("\nЗадание 2.3 (tern with error)");
        System.out.println("Программа рассчета стоимости покупки с учетом скидки.");
        System.out.print("\nВведите, пожалуйста, стоимость покупки: ");
        Scanner sc = new Scanner(System.in);
        double sum = sc.nextDouble(); //Ввод данных через запятую, результат - через точку?
        double discount = (sum >= 1000) ? 0.95 : (sum >= 500) ? 0.97 : (sum > 0) ? 1 : 0; //Размер скидки указывает с кучей нулей и в конце добавляются числа
        double finalSum = sum * discount;
        System.out.println("\nВаша скидка составляет: " + (1 - discount) * 100 + "%.");
        System.out.println("Общая сумма Вашей покупки с учетом скидки составляет: " + finalSum + " грн.");
    }

    private static void Task_2_4_if() {
        System.out.println("\nЗадание 2.4 (if-else)");
        System.out.print("Введите, пожалуйста, целое число и нажмите 'Enter': ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0)
            System.out.println("\nВведите, пожалуйста, число, отличное от нуля!");
        else if (number % 2 != 0)
            System.out.println("\nВы ввели число " + number + " - это нечетное число!");
        else
            System.out.println("\nВы ввели число " + number + " - это четное число!");
    }

    private static void Task_2_4_if_test() {
        System.out.println("\nЗадание 2.4 (if-else test)");
        System.out.print("Введите, пожалуйста, целое число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 != 0)
            System.out.println("\nВы ввели число " + number + " - это нечетное число!");
        else
            System.out.println("\nВы ввели число " + number + " - это четное число!");
    }

    private static void Task_2_4_tern() {
        System.out.println("\nЗадание 2.4 (tern)");
        System.out.print("Введите целое число и нажмите 'Enter': ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = (number == 0) ? ("\nВведите, пожалуйста, число, отличное от нуля!") : (number % 2 != 0) ? ("\nВы ввели число " + number + " - это нечетное число.") : ("\nВы ввели число " + number + " - это четное число.");
        System.out.println(result);
    }

    private static void Task_2_5_tern() {
        System.out.println("\nЗадание 2.5 (tern)");
        System.out.print("Введите, пожалуйста, целое число и нажмите 'Enter': ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String result = number == 0 ? "\nВведите, пожалуйста, число, отличное от нуля!" : number % 3 == 0 ? "\nВведенное число (" + number + ") делится на три нацело." : "\nВведенное число (" + number + ") не делится на три нацело.";
        System.out.println(result);
    }

    private static void Task_2_6() {
        System.out.println("\nЗадание 2.6");
        System.out.println("Данная программа вычисляет стоимость разговора в зависимости от продолжительности и дня недели.");
        System.out.println("Введите, пожалуйста, исходные данные.");
        System.out.print("\nПродолжительность разговора: ");
        Scanner sc = new Scanner(System.in);
        double duration = sc.nextDouble();
        if (duration < 0)
            System.out.print("Продолжительность разговора не может быть отрицательным числом!");
        else if (duration - (int) duration > 0) {
            System.out.println("Для определения стоимости разговора требуется только целое количество минут: " + (int) duration);
            System.out.print("Стоимости минуты разговора: ");
        } else
            System.out.print("Стоимости минуты разговора: ");
        double cost = sc.nextDouble();
        if (cost < 0)
            System.out.print("Стоимость минуты разговора не может быть отрицательным числом!");
        else
            System.out.print("Укажитк день недели (1 - Понедельник ... 7 - Воскресенье): ");
        int day = sc.nextInt();
        double discount = 0;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                double sum = (int) duration * cost;
                System.out.println("\nСтоимость Вашего разговора составляет: " + sum + " грн.");
                break;
            }
            case 6:
            case 7: {
                double sum = (int) duration * cost * 0.8;
                System.out.println("\nСтоимость Вашего разговора составляет: " + sum + " грн.");
                break;
            }
            default: {
                System.out.print("Выберите, пожалуйста, верный день недели от 1 (Понедельник) до 7 (Воскресенье)");
                break;
            }

        }
    }

    private static void Task_2_7() {
        System.out.println("\nЗадание 2.7");
        System.out.print("Введите целое трехзначное число для анализа: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number1 = number / 100;
        int number2 = (number / 10) % 10;
        int number3 = number % 10;
        String compare1 = (number1 > number3) ? "Первая цифра больше третьей" : "Третья цифра больше первой";
        System.out.println("a) " + compare1);
        String compare2 = (number1 > number2) ? "Первая цифра больше второй" : "Вторая цифра больше первой";
        System.out.println("б) " + compare2);
        String compare3 = (number2 > number3) ? "Вторая цифра больше третьей" : "Третья цифра больше второй";
        System.out.println("в) " + compare3);
    }

    private static void Task_2_8() {
        System.out.println("\nЗадание 2.8");
        System.out.print("Введите, пожалуйста, целое трехзначное число для анализа: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number1 = number / 100;
        int number2 = (number / 10) % 10;
        int number3 = number % 10;
        if (Math.pow(number, 2) == Math.pow(number1, 3) + Math.pow(number2, 3) + Math.pow(number3, 3))
            System.out.println("\nКвадрат заданного числа равен сумме кубов его цифр");
        else
            System.out.println("\nКвадрат заданного числа не равен сумме кубов его цифр");
    }

    private static void Task_2_9() {
        System.out.println("\nЗадание 2.9");
        System.out.print("Введите, пожалуйста, значение X: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.print("Введите, пожалуйста, значение Y (не равное значению X): ");
        double y = sc.nextDouble();
        if (y == x)
            System.out.println("\nОшибка! Введенное значение Y равно значению X");
        else if (x < y) {
            x = (x + y) / 2;
            y = x * y * 2;
            System.out.println("\nНовое значение X = " + x + ", новое значение Y = " + y);
        } else {
            y = (x + y) / 2;
            x = x * y * 2;
            System.out.println("\nНовое значение X = " + x + ", новое значение Y = " + y);
        }
    }
}