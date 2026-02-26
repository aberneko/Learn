package com.aberneko.learning.ClassString;

public class main {
    static void main() {
        System.out.println(
                """
                        String myString = "Привет!" - объект-строка создаётся через строковый литерал
                        Литералы — это заранее определённые константные значения в программе.
                        Литералы используются для создания значений примитивных типов:
                        """

//              int age = 23; // 23 — числовой литерал
//              String name = "Байт"; // "Байт" — строковый литерал
//              boolean isJavaAwesome = true; // true — булев литерал

//              Позволяет JVM использовать специальные оптимизации для строк.

        );
        System.out.println(
                """
                        String Pooling (Пул строк при компиляции):
                        - происходит на этапе компиляции
                        - экономит место в файле
                        - только литерали (строки в кавычках)
                        
                        Пул строк — это место хранения единственного экземпляра (оригинала) каждой уникальной литеральной строки»
                        """
        );
        System.out.println(
                """
                        `.leagth()` -  сколько символов в строке
                        `.isEmpty()` - является ли строка пустой или нет
                            `.isBlank()` - вернёт true если строка пустая или состоит из пробелов
                        `.trim()` - очистит проблелы в начале и в конце
                        `.toUpperCase()` - верхний регистр
                        `.tolowerCase()` - нижний регистр
                        """

//              public class PasswordChecker {
//                  public boolean checkPassword(String password) {
//                       if (password.isEmpty()) { // проверяем, не является ли строка пустой
//                            System.out.println("Пароль отсутствует.");
//                            return false;
//                      } else if (password.length() < 8) { // размер строки не должен быть меньше 8 символов
//                         System.out.println("Пароль слишком короткий.");
//                            return false;
//                      }
//                       System.out.println("Подходящий пароль.");
//                       return true;
//                   }
//
//                   public static void main(String[] args) {
//                     PasswordChecker checker = new PasswordChecker();
//
//                        System.out.println(checker.checkPassword(""));           // false
//                        System.out.println(checker.checkPassword("S34fd1265Jd")); // true
//                        System.out.println(checker.checkPassword("          "));  // true
//                          System.out.println(checker.checkPassword("shortpw"));    // false
//                  }
//              }

//              public class Practicum {
//                  public static void main(String[] args) {
//                      String blank = "   ";
//                      String notBlank = "Тут пробелы или строка?!";
//                      System.out.println(blank.isBlank()); // true
//                      System.out.println(notBlank.isBlank()); // false
//
//                      String withBlanks = "  Привет, у меня тут лишние пробелы!";
//
//                      System.out.println(withBlanks.trim());
//                  }
//              }

//              public class Practicum {
//                  public static void main(String[] args) {
//                      String text = "Привет, я Java!";
//                      System.out.println(text.toUpperCase()); // выведет "ПРИВЕТ, Я JAVA!"
//                      System.out.println(text.toLowerCase()); // выведет "привет, я java!"
//                  }
//              }

        );
        System.out.println(
                """
                Подстрока (англ. substring) — это непрерывный набор символов внутри строки. Например, «обед» — подстрока для «победа»
                Подстроки чувствительны к регистру.
                
                Ориентироваться внутри строк и искать подстроки позволяет внутренняя нумерация символов.
                Для манипуляции с подстроками предусмотрены свои методы:
                
                        \\indexOf(String str\\ - ищет слева направо
                        \\lastIndexOf(String str)\\ - справа налево                                                     - можно найти индекс начала подстроки
                        Если подстрока не найдена: -1;
                
                        так же принимает в себя аргумент индекса, с которого нужно начать поиск.
                
                        \\charAt(int index) - получение символа по индексу
                """

//                String start = "Hello, world!";
//                System.out.println(start.indexOf("world"));                                                           БУдет выведено 7 - так как индекс первого элемента подстроки 7

//                String start = "Hello, world!";
//                System.out.println(start.indexOf("world", 7));                                                        indexOf(String start, int fromIndex)

//                String start = "Hello, world!";
//                System.out.println(start.charAt(7));                                                                  будет выведено `w`
        );


    }
}
