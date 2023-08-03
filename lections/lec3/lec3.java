package lections.lec3;

import java.util.*;

public class lec3 {
    public static void main(String[] args) {
        // ex01_obj();
        // ex02_obj();
        // ex03_objList();
        // ex04_objList();
        // ex05_objList();
        // ex06_objList();
        // ex07_objList();
        // ex08_objList();
        // ex09_objList();
        // ex10_objList();
        ex01_Collection();
        ex02_Collection();
        ex03_Collection();
        ex04_Collection();

    }

    // Тип данных Object – «всему голова»
    // Упаковка – любой тип можно положить в переменную типа Object
    // Распаковка – преобразование Object-переменной в нужный тип
    // Иерархия типов – любой тип «ниже» Object’а
    public static void ex01_obj() {
        Object o = 1;
        String strEx_1 = GetType(o);
        System.out.println(strEx_1);
        // java.lang.Integer
        o = 1.2;
        System.out.println(GetType(o));
        // java.lang.Double
    }

    public static String GetType(Object obj) {
        return obj.getClass().getName();
    }

    public static void ex02_obj() {
        int[] a = new int[] { 0, 9 };
        System.out.println(Arrays.toString(a));
        a = AddItem(a, 2);
        System.out.println(Arrays.toString(a));
        a = AddItem(a, 3);
        System.out.println(Arrays.toString(a));
    }

    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    // List – пронумерованный набор элементов.
    // ArrayList, LinkedList (Vector, Stack – устаревшие)
    // ArrayList<Integer> list1 = new ArrayList<Integer>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3 = new ArrayList<>(10);
    // ArrayList<Integer> list4 = new ArrayList<>(list3);
    public static void ex03_objList() {
        List<Object> list = new ArrayList<>();
        // List list = new ArrayList();
        list.add(2809);
        list.add("string line");
        for (Object o : list) {
            System.out.println(o);
        }

    }

    public static void ex04_objList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(123);
        for (Object o : list) {
            System.out.println(o);
        }
    }

    {}
    // 1. Коллекции. Функционал
    {
    }
    {
        // add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)
        // get(pos) – возвращает элемент из списка по указанной позиции
        // indexOf(item) – первое вхождение или -1
        // lastIndexOf(item) – последнее вхождение или -1
        // remove(pos) – удаление элемента на указанной позиции и его возвращение
        // set(int pos, T item) – помещает значение item элементу,
        // который находится на позиции pos
        // void sort(Comparator) – сортирует набор данных по правилу
        // subList(int start, int end) – получение набора данных от позиции start до end
    }

    // add(index, element)
    // get(pos)
    public static void ex01_Collection() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.add(0, 30);
        list.add(0, 40);
        System.out.println(list);
        System.out.println(list.get(0));
    }

    // indexOf(item)
    // lastIndexOf(item)
    // remove(pos)
    public static void ex02_Collection() {
        System.out.println();
        System.out.println();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2));
        System.out.println(list);
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));

        System.out.println();
        System.out.println();
        list.addAll(0, list);
        System.out.println(list);
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list);

    }

    // set(int pos, T item)
    // sort(Comparator) -> Collections.sort(list);
    public static void ex03_Collection() {
        System.out.println();
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        System.out.println(list);
        list.set(0, 123);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    // subList(int start, int end)
    public static void ex04_Collection() {
        System.out.println();
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 50, 100, 200, 400, 900));
        System.out.println(list);
        List<Integer> list2 = list.subList(2, 6);
        System.out.println(list2);
        List<Integer> list3 = list.subList(0, list.size());
        System.out.println(list3);

    }

    public static void ex05_objList() {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d);
    }

    public static void ex06_objList() {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        month = new StringBuilder("09");
        System.out.println(d);
    }

    public static void ex07_objList() {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("09");
        System.out.println(d);
    }

    // 2. Коллекции. Функционал
    {
    }
    {
        // clear() – очистка списка;
        // toString() – «конвертация» списка в строку;
        // Arrays.asList – преобразует массив в список;
        // containsAll(col) – проверяет включение всех элементов из col;
        // removeAll(col) – удаляет элементы, имеющиеся в col;
        // retainAll(col) – оставляет элементы, имеющиеся в col;
        // toArray() – конвертация списка в массив Object’ов;
        // toArray(type array) – конвертация списка в массив type;
        // List.copyOf(col) – возвращает копию списка на основе имеющегося;
        // List.of(item1, item2,...) – возвращает неизменяемый список;
    }

    public static void ex08_objList() {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1); //
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
    }

    // Итератор
    {
    }
    {
        // Интерфейс Iterator<E>. Итератор коллекцией. ;
        // Iterator занимает место Enumeration в Java Collections Framework.;
        // Итераторы отличаются от перечислений двумя способами:
        // Итераторы позволяют вызывающей стороне удалять;
        // элементы из базовой коллекции во время итерации с четко определенной
        // семантикой. hasNext(), next(), remove();
        // ListIterator<E>
        // hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
    }

    public static void ex09_objList() {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();

        while (col.hasNext()) {
            System.out.println(col.next());
        }
    }

    public static void ex10_objList() {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col1 = list.iterator();

        while (col1.hasNext()) {
            for (int item : list) {
                System.out.printf("d% ", item);
            }
            col1.remove();

        }
    }

}
