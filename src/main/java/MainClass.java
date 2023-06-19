import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Калькулятор
 * @author Sergey Kropotov
 * @version 1.0
 */

public class MainClass {

    //точка входа в программу
    public static void main(String[] args) {
        //создание объектов и объявление переменных
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int numberOfTask = sc.nextInt();

        switch (numberOfTask) {
            case 1 -> new Calculator(sc);
            case 2 -> new StringArray(sc);
        }


    }

}
