import java.util.Scanner;

public class Calculator {

    public Calculator(Scanner sc) {
        calculate(sc);
    }

    /**
     *
     * @param sc
     */
    private void calculate(Scanner sc) {
        float a, b;
        String action;
        String resultText = "Результат равен: ";

        //Запрос ввода числа a
        System.out.println("Введите число a:");
        if(sc.hasNextFloat()) {
            a = sc.nextFloat();
        } else {
            System.out.println("Вы ввели не число");
            return;
        }

        //Запрос ввода числа b
        System.out.println("Введите число b:");
        if(sc.hasNextFloat()) {
            b = sc.nextFloat();
        } else {
            System.out.println("Вы ввели не число");
            return;
        }

        //Запрос ввода требуемого действия
        System.out.println("Введите символ, обозначающий желаемое действие: \n" +
                "+ : сложить a и b \n- : вычесть из a b \n* : умножить a на b \n/ : делить a на b \n");
        action = sc.next();

        //Проверка деления на 0
        if(b == 0 && action.equals("/")) {
            System.out.println("На 0 делить нельзя.");
            sc.close();
            return;
        }

        //Отображение результата в зависимости от выбранного действия
        switch (action) {
            case "+" -> System.out.printf(resultText + "%.4f", addition(a, b));
            case "-" -> System.out.printf(resultText + "%.4f", subtraction(a, b));
            case "*" -> System.out.printf(resultText + "%.4f", multiply(a, b));
            case "/" -> System.out.printf(resultText + "%.4f", divide(a, b));
            default -> System.out.println("Такое действие не предусмотрено");
        }

        //Закрытие scanner
        sc.close();
    }

    /**
     *
     * @param a - введенное число a
     * @param b - введенное число b
     * @return возвращает результат сложения a + b
     */
    private float addition(float a, float b) {
        return a + b;
    }

    /**
     *
     * @param a - введенное число a
     * @param b - введенное число b
     * @return возвращает результат вычитания a - b
     */
    private float subtraction(float a, float b) {
        return a - b;
    }

    /**
     *
     * @param a - введенное число a
     * @param b - введенное число b
     * @return возвращает результат умножения a * b
     */
    private float multiply(float a, float b) {
        return a * b;
    }

    /**
     *
     * @param a - введенное число a
     * @param b - введенное число b
     * @return возвращает результат деления a / b
     */
    private float divide(float a, float b) {
        return a / b;
    }
}
