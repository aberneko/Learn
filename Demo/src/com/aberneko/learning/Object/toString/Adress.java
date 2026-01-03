package com.aberneko.learning.Object.toString;

import java.util.Arrays;

class Adress {
    public String city;
    public String street;
    public int houseNumber;
    public String info; // добавлено поле, что бы показать 2 правило
    public String[] residents; // добавляем поле, что бы показать 4 правило

    public Adress(String city, String street, int houseNumber, String info, String[] residents) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.info = info;
        this.residents = residents;
    }



    @Override // Стандартная реализация + ПРАВИЛА
    public String toString() {
        // 1. Единый формат.
        String result = "Adress{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber + '\'';
        // 2. Лаконичность и информативность
        // Вместо вывода всего текста, мы выведем его размер
        // ", info=" + info.length() +

        // 3. Профилактика исключений NullPointerException
        if (info != null) { // проверяем, что поле не содержит null
            result = result + ", info.length=" + info.length(); // выводим не значение, а длину
        } else {
            result = result + ", info=null"; // выводим информацию, что поле равно null
        }

        // 4. Форматирование данных.
        return result +
                // форматируем массив с помощью метода Arrays.toString
                ", residents=" + Arrays.toString(residents) +
                "}";

    }

    /*// реализация Java 15
    @Override
    public String toString() {
        return String.format("Adress{city='%s',street='%s' houseNumber='%s'}", city, street, houseNumber);
    }*/
}

class Practicum {
    public static void main(String[] args) {
        String[] add1 = {"efwef", "wfwe", "fwef", "fwef", "wefew"};
        String[] add2 = {"wefwf", "wefwef", "wefwef", "fwefwe", "wefwef"};

        String info = "Переночевав в гостинице в Гуаякиле, мы сели к агенту в машину и поехали на судно в Пуэрто Боливар. Доехали вопреки ожиданиям быстро, примерно за 3-4 часа. Погода была пасмурная и даже не смотря на то, что мы находимся недалеко от экватора, было прохладно. Почти все время, пока мы ехали, по обе стороны дороги были банановые плантации, но все равно в голове не укладывается: эти бананы грузят на суда в нескольких портах Эквадора десятками тысяч тонн каждый день, круглый год. Это ж несчастные бананы должны расти быстрее чем грибы.";
        String info2 = "На первый взгляд судно неплохое, в относительно хорошем состоянии, хотя и 92 года постройки. Экипаж 19 человек - 11 русских и 8 филиппинцев, включая повара. Говорят, периодически становится тоскливо от егошних кулинарных изысков. Филиппинцы здесь рядовой состав, за ними постоянно нужно следить чтобы не натворили чего, среди них только один матрос по-настоящему ответственный и с руками из нужного места, все понимает с полуслова. Остальные - типичные Равшаны да Джамшуты. А еще один из них - гомосек О___о, в добавок к этому он опасный человек, в том плане, что легко впадает в состояние ступора и отключает мозг: был случай как он закрыл одного матроса в трюме, тот орал и тарабанил внутри, это заметил боцман, начал орать на этого персонажа, который, в свою очередь испуганно выпучив глаза, трясущимися руками продолжал закручивать барашки. В итоге боцман его отодвинул и выпустил матроса из трюма. Общение на английском языке, но из-за акцента не всегда с первого раз понятно что филиппинцы говорят, особенно по рации. Напимер, говорит он тебе: Бикарпуль! Бикарпуль! А потом, когда уже поздно, выясняется что это было";

        Adress address = new Adress("Санкт-Петербург", "Дворцовая набережная", 32, info, add1);
        Adress address2 = new Adress("Санкт-Петербург", "Кирочная", 19, info2, add2 );


        System.out.println("Адрес 1: " + address);
        System.out.println("Адрес 2: " + address2);
    }
}
