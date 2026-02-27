package com.aberneko.learning.ClassString;

public class Test {
    public boolean onlyStringTest(String text, String word) {
        return text.indexOf(word) == text.lastIndexOf(word);
    }

    public String maskCardNumber(String cardNumber) {
        return cardNumber.substring(0, 4) + " **** **** " + cardNumber.substring(12, 16);
    }

    int numberOfRepeats(String text, String substring) {
        int count = 0;
        while(text.contains(substring)) {
            count++;
            int startIndex = text.indexOf(substring); // нашёл слово которое метод уже нашёл
            int indexCut = startIndex + substring.length(); // отрезал левую часть
            text = text.substring(indexCut);

        }
        return count;
    }



    static void main(String[] args) {
        // onlyStringTest
        Test string = new Test();
        System.out.println(string.onlyStringTest("кристина душка", "душка"));
        System.out.println(string.onlyStringTest("кристина душка, и тут тоже кристина душка", "душка"));

        // maskCardNumber
        System.out.println(string.maskCardNumber("1234567890123456"));

        // numberOfRepeats
        int count = string.numberOfRepeats("раз два три, раз два три", "раз");
        System.out.println(count);
    }

}


