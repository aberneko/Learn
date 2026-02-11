package com.aberneko.learning.CollectionF.Interfes.Itarable.Collection.List.LinkedList;

public class SinglyLinkedList<T> { // Сам список
    public Node<T> head; // для головного элемента
    private int size = 0; // длина списка
}


class Node<T> { // для элемент-узлов T - тип данных внутри списка
    public T data; // Данные внутри элемента
    public Node<T> next; // для ссылки

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class DoublyLinkedList<T> {
    public Node2<T> head; // для головного элемента
    private int size = 0; // длина списка
    public Node2<T> tail; // для хвоста
}


class Node2<T> { // для элемент-узлов T - тип данных внутри списка
    public T data; // Данные внутри элемента
    public Node2<T> next; // для ссылки на следующий элемент
    public Node2<T> prev; // для ссылки на предыдущий элемент

    Node2(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}