package com.aberneko.learning.OOP.Inheritance;

import java.util.ArrayList;

public class Teacher {


    ArrayList<Teacher> all;

    public Teacher(){
        all = new ArrayList<>();
    }


    public void addList() {
        all.add(new Georraphy());
        all.add(new Math());

        for (Teacher t: all) {
            System.out.println(t);
        }
    }



    public String alwrite() {
        return "Встать";
    }
}
