package com.aberneko.learning.ClassString;

public class Test {
    public boolean onlyStringTest(String text, String word) {
        return text.indexOf(word) == text.lastIndexOf(word);
    }

    static void main(String[] args) {
        Test string = new Test();
        System.out.println(string.onlyStringTest("кристина душка", "душка"));
        System.out.println(string.onlyStringTest("кристина душка, и тут тоже кристина душка", "душка"));
    }

}
