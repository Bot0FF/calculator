import java.util.*;

public class StringArray {

    private final List<String> listString;

    public StringArray(Scanner sc) {
        listString = new ArrayList<>();
        stringArrayResult(sc);
    }

    //получает длину массива и выводит самое длинное слово
    private void stringArrayResult(Scanner sc) {
        System.out.println("Введите длину массива слов:");
        int arrayLength;

        if(sc.hasNextInt()) {
            arrayLength = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число");
            return;
        }

        for(int i = 0; i < arrayLength; i++) {
            listString.add(sc.next());
        }

        System.out.println("Самое длинное слово из введенных: " + wordLengthCount(listString));
    }

    /**
     *
     * @param list
     * @return возвращает самое длинное слово из списка
     */
    private String wordLengthCount(List<String> list) {
        return Collections.max(list, Comparator.comparing(String::length));
    }
}
