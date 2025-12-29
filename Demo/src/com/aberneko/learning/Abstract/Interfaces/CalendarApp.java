package com.aberneko.learning.Abstract.Interfaces;

import java.util.ArrayList;

/*.Класс обязательно должен либо реализовать все методы интерфейса, либо объявить себя абстрактным —
    иначе при компиляции возникнет ошибка: “<Class name> is not abstract and does not override abstract method
    <method name> in <interface name>” (англ. «[Класс] не является абстрактным и не переопределяет метод из [интерфейса]»).*/

public class CalendarApp implements NoteBook, Math{ // Реализуем интерфейс
    ArrayList<String> notes = new ArrayList<>();

    @Override
    public void addNote(String note) { // Переопределеяем метод
        notes.add(note);
        System.out.println("Заметка успешно добавлена!");
    }

    @Override
    public void deleteNote(int index) {
        notes.remove(index);
        System.out.println("Заметка успешно удалена");
    }

//    public void print(int index) {
//        System.out.println(notes.get(index));
//    }

    public void print() {
        System.out.println(notes);
    }

}
