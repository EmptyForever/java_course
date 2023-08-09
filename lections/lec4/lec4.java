package lections.lec4;

// import java.util.LinkedList;
import java.util.*;

// import java.util.Iterator;

/**
 * lec4
 */
public class lec4 {

    // LinkedList - Добавление или удаление
    // в начало или маленький список вообще очень быстрое для люього количества
    // элементов
    // Для чтения лучше массив
    // ArrayList - чтение данных
    public static void main(String[] args) {
        // ArrayListex01_state();
        // LinkedListex02_state();
        // queue01();
        // queue02();
        // queue03();
        // priorityQueue();
        // deque();
        // stackEx();
        exStack01();

    }

    // ArrayList список массив - для чтения данных
    public static void ArrayListex01_state() {
        System.out.println("hell");
        Integer[] arr = new Integer[10_000_000];
        Random rndInt = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndInt.nextInt(100);
        }
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_000; i++) {
            // list.remove(0);
            // list.add(0, 0);
            // list.add(null)
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    // LinkedList список Linked для быстрого добавления/удаления в начало
    public static void LinkedListex02_state() {
        LinkedList<Integer> listL = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            listL.add(i);
        }
        long start = System.currentTimeMillis();
        // Random rnd = new Random();
        for (int i = 0; i < 10_000; i++) {
            // listL.remove(0);
            // listL.add(rnd.nextInt(1, 1000000), 0);
            // listL.add(9_000_000, 0);
            listL.add(0);
        }

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }

    // Queue удаляется тот, кто был первым добавлен
    public static void queue01() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue);
        int item = queue.remove();
        System.out.println(queue);
        queue.add(5);
        System.out.println(queue);
        queue.add(28);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }

    // удаляет queue.remove(); queue.poll();
    // добавляет queue.add(4); queue.offer(2809);
    public static void queue02() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(item);
        System.out.println(queue); // [2809]
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

    // текущий элемент на очереди
    // queue.peek(), queue.element()
    // если список пустойЖ
    // .peek() -> null --- .element() -> Exception
    public static void queue03() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        int item = queue.remove();
        System.out.println(queue);

        queue.offer(2809);
        queue.offer(2809);
        queue.offer(2809);
        item = queue.poll();
        item = queue.poll();
        // item = queue.poll();
        System.out.println(queue);
        System.out.println(queue.element());
        queue.remove();
        // System.out.println(queue);
        // System.out.println(queue.peek());
        System.out.println(queue.element());

        // queue.element();
        queue.offer(1000);
        queue.offer(2809);
        queue.offer(1001);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue);

        // queue.peek();
    }

    // PriorityQueue - приоритет извлечения (наименьший элемент).
    // Что такое наименьший?
    // самый маленький котик выходит первым. большой котик в конце
    public static void priorityQueue() {
        PriorityQueue<Integer> listPriority = new PriorityQueue<Integer>();
        listPriority.add(124);
        listPriority.add(122);
        listPriority.add(120);
        listPriority.add(12);
        listPriority.add(1);
        listPriority.add(12);
        System.out.println(listPriority);
        // ! !
        // [1, 12, 12, 124, 120, 122]
        System.out.println(listPriority.poll());
        System.out.println(listPriority);
        System.out.printf("%d ", listPriority.poll());
        System.out.printf("%d ", listPriority.poll());
        System.out.printf("%d ", listPriority.poll());
        System.out.printf("%d ", listPriority.poll());
        System.out.printf("%d ", listPriority.poll());
        System.out.printf("%d ", listPriority.poll());
        // 12 12 120 122 124 null

    }

    // Deque двунаправленная очередь
    // можно дабавить в конец/начало и удалить из конца/начала
    public static void deque() {
        Deque<Integer> deque = new ArrayDeque<>();
        // Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(123);
        deque.addLast(124);
        deque.addLast(120);
        deque.addFirst(121);
        System.out.println(deque);
        // int temp = deque.size();
        // for (int i = 0; i < temp; i++) {
        // System.out.printf("%d ", deque.removeLast());
        // }
        // deque.removeLast();
        // deque.removeLast();
        deque.offerFirst(10);
        deque.offerLast(2);
        System.out.println(deque);
        int temp = deque.size();
        for (int i = 0; i < temp; i++) {
            System.out.printf("%d ", deque.pollLast());
        }
        System.out.println();
        System.out.println(deque);
        // deque.pollFirst();
        // deque.pollLast();
        // deque.getFirst();
        // deque.getLast();
        // deque.peekFirst();
        // deque.peekLast();
    }

    // Stack - LiFo
    // последний зашедший ближже всего к выходу
    // добавить - push()
    // удалить - pop()
    public static void stackEx() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(12);
        stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1
        stack.add(7);
        // stack.push(1);
        // stack.push(12);
        // stack.push(123);
        stack.add(1, 12);
        stack.add(1, 12);
        System.out.println(stack);
        // stack.add(2, 0);

    }

    // 1 2 3 * +
    // вычислить выражение в префиксной записи
    public static void exStack01() {
        Stack<Object> stack1 = new Stack<>();
        // String str1 = "1 2 3 * +";
        // String[] arrStr = str1.split(" ");
        // var arrStr = str1.split(" ");р
        var arrStr = "1 2 3 * +".split(" ");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Character.isDigit('1'));
        // 1. встречая число нужно записать его в стек
        // 2. встречая знак нам нужно достать из стека два числа
        // 3. достав два числа из стека и знак из строки получаем результат и кладём его
        // в стек
        // если длина стека 1 то ретёрн это значение ёпта
        // for (int i = 0; i < arrStr.length; i++) {
        // System.out.print(arrStr[i]);
        // if (isDigit(arrStr[i]))
        // Integer.parseInt(arrStr[i]);
        // System.out.print(arrStr[i]);
        // }

    }

}