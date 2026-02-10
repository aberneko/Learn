package Collection.LinkedList.Task;
import java.util.NoSuchElementException;

// В пиратской версии языка Java, которую скачал ваш коллега, забыли добавить класс LinkedList<T>!
// Вам нужно реализовать его самостоятельно.

// Часть кода уже представлена в классе HandMadeLinkedList<T>. Например, здесь уже есть структура Node<T>,
// представляющая один элемент в двусвязном списке, а также методы для добавления элемента в начало addFirst<T>,
// взятия элемента из начала getFirst(), а также метод, возвращающий количество элементов в двусвязном списке size().

// Реализуйте ещё два метода — добавление элемента, а в конец addLast<T> и получение последнего элемента — getLast().

public class HandMadeLinkedList<T> {

    class Node<E> {
        public E data;
        public Node<E> next;
        public Node<E> prev;

        public Node(Node<E> prev, E data, Node<E> next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


    /**
     * Указатель на первый элемент списка. Он же first
     */
    private Node<T> head;

    /**
     * Указатель на последний элемент списка. Он же last
     */
    private Node<T> tail;

    private int size = 0;

    public void addFirst(T element) {
        final Node<T> oldHead = head; //
        final Node<T> newNode = new Node<>(null, element, oldHead); // создаем новую ячейку и передаем в не данные
        head = newNode; // указываем нашу новую ячейку как первый элемент
        if (oldHead == null) // если там изначально никого не было – то первый станет последним и наоборот
            tail = newNode;
        else
            oldHead.prev = newNode; // старый элемент теперь ссылается на твой первый
        size++; // увеличиваем размер
    }

    public T getFirst() {
        final Node<T> curHead = head;
        if (curHead == null)
            throw new NoSuchElementException();
        return head.data; // вернули содержимое через указатель
    }

    public void addLast(T element) {
       final Node<T> oldLast = tail;
       final Node<T> newLast = new Node<>(oldLast, element, null);
       tail = newLast;
       if (oldLast == null){
           head = newLast;
       } else {
           oldLast.next = newLast;
       }
       size++;
    }

    public T getLast() {
        final Node<T> curTail = head;
        if (curTail == null)
            throw new NoSuchElementException();
        return tail.data; // вернули содержимое через указатель
    }

    public int size() {
        return this.size;
    }

    public static void main(String[] args) {
        HandMadeLinkedList<Integer> integers = new HandMadeLinkedList<>();

        integers.addFirst(1);
        integers.addFirst(2);
        integers.addFirst(3);
        integers.addLast(4);
        integers.addLast(5);
        integers.addFirst(1);

        System.out.println(integers.getFirst());
        System.out.println(integers.size());
        System.out.println(integers.getLast());
        System.out.println(integers.size());
    }
}
