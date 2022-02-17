public class Palindrome {
    public static void main(String[] args) // функция принимает аргументы командной строки
    { 
        for (int i = 0; i < args.length; i++) // цикл от нуля до количества аргументов
        { 
            String s = args[i]; // присовоение аргумента переменной s
            String reversedString = reverseString(s); // переменная, сохраняющая обратное слово с помощью функции reverseString
            System.out.println(s); // печать изначального аргумента и обратного
            System.out.println(reversedString);
            boolean check = isPalindrome(s);
            String result; // строковая переменная для вывода заданного текста
            if (check == true) { // проверка
                result = "Palindrome";
            }
            else {
                result = "Non-palindrome";
            }
            System.out.println(result); // печать результата по аргументу - палиндром или не палиндром
            System.out.println(" ");
        }
    }
    public static String reverseString(String s) // функция принимает на вход переменную s, которая принимает значения аргументов командной строки
    { 
        String reversed = ""; // создание пустой строковой переменной, куда побуквенно будут добавляться символы
        for (int i = s.length() - 1; i >= 0; --i) { // цикл, идущий в обратном порядке до длины s-1
            reversed += s.charAt(i); // добавление конкретного символа в строку на итерации с помощью метода charAt
        }
        return reversed; 
    }
    public static Boolean isPalindrome(String s) // функция принимает на вход переменную s, которая принимает значения аргументов командной строки
    { 
        return s.equals(reverseString(s)); // использование метода equals для сверки изначальных данных с "перевёрнутыми"
    }
}
