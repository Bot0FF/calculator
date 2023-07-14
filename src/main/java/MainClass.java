import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Калькулятор
 * @author Sergey Kropotov
 * @version 1.0
 */

public class MainClass {

    //точка входа в программу
    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        char action = 0;
        //создание объектов и объявление переменных
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите число a");
            a = sc.nextFloat();
            System.out.println("Введите число b");
            b = sc.nextFloat();
            System.out.println("Введите символ, обозначающий желаемое действие: \n" +
                    "+ : сложить a и b \n- : вычесть из a b \n* : умножить a на b \n/ : делить a на b \n");
            action = sc.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Введено неверное значение");
        }


        Calculator calculator = new Calculator(a, b, action);
        System.out.println(new DecimalFormat("#.##").format(calculator.calculateResult()));
    }

}
