import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class program3 {
    public static void main(String[] args) {
        // task1();
        // task2();
        task3();
    }

    // Заполнить список десятью случайными числами.
    // Отсортировать список методом sort() и вывести его на экран.
    public static void task1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(0, 10));

        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

    }

    // Заполнить список названиями планет
    // Солнечной системы в произвольном порядке с повторениями.
    // Вывести название каждой планеты
    // и количество его повторений в списке.
    public static void task2() {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("mars", "Earth", "merc", "venera", "ven", "mars"));

        ArrayList<String> dublicate = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            int tempCount = 0;
            if (!dublicate.contains(planets.get(i))) {

                dublicate.add(planets.get(i));
                for (int j = i; j < planets.size(); j++) {
                    if (planets.get(i).equals(planets.get(j))) {
                        tempCount++;
                    }
                }
                // System.out.println(planets.get(i) + " " + tempCount);
                System.out.printf("%s %d", planets.get(i), tempCount);
                System.out.println();
            }

        }
    }

    // Создать список типа ArrayList.
    // Поместить в него как строки, так и целые числа.
    // Пройти по списку, найти и удалить целые числа.
    public static void task3() {
        ArrayList<Object> listObj1 = new ArrayList<>(Arrays.asList(3, 4, "45.9", "55",
                "5", 5, 6, 9, 0, 11, "bratok", "katok"));
        // второе решение
        // for (int i = 0; i < array.length; i++) {
                    
                
        // // for (Object object : listObj1) {
        // // if (object.)
        // // }
        // // for (int i = 0; i < listObj1.size(); i++) {
        // // if (listObj1.get(i) instanceof Integer) {
        // // listObj1.remove(i);
        // // i--;
        // // }
        // // }
        // // System.out.println(listObj1);

        // // }
        // }
        
        
        Iterator<Object> list1 = listObj1.iterator();
        System.out.println(listObj1);
        while (list1.hasNext()) {
            if (list1.next() instanceof Integer) {
                list1.remove();
            }
        }
        System.out.println(listObj1);
    }

}
