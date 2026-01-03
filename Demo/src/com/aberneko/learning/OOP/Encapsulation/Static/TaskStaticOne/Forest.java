package com.aberneko.learning.OOP.Encapsulation.Static.TaskStaticOne;

import java.util.ArrayList;

public  class Forest {
    private ArrayList<MountainHare> hares;

    private String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    public void setSeason(String newSeason) {
        this.season = newSeason;
        if(season.equals("зима")) {
            MountainHare.color = "белый";
        } else if (season.equals("лето")) {
            MountainHare.color = "серо-рыжий";
        }
    }

    public void printHares(){
        for (MountainHare here : hares) {
            System.out.println(here);
        }
    }


    // объявите недостающие переменные и добавьте конструктор

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков

    // добавьте метод printHares()

}
