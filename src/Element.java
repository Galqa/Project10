/* Виведення на екран елементів List:
 Створити список, заповнити його на 10 елементів та вивести на екран вміст, використовуючи iterator.
 */

import java.util.*;

public class Element {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // створюємо список
        for (int i = 1; i <= 10; i++) {  //заповнюємо список
            list.add(i);
        }


        Iterator<Integer> iterator = list.iterator(); // виводимо зміст списку з допомогою ітератора
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


