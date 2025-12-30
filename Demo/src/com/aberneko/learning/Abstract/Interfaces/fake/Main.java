package com.aberneko.learning.Abstract.Interfaces.fake;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        MakeSound phone = new Phone();
        MakeSound clock = new Clock();

        List<MakeSound> s = List.of(clock, phone);

        for(MakeSound make : s) {
            make.alarm();
        }


    }

}
