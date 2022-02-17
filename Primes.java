public class Primes {
    public static void main(String[] args) { // функция, выводящая все простые числа в диапазоне цикла for 
        for (int i = 2; i < 101; i++) { // цикл от 2 до 100 включительно
            boolean num = isPrime(i); // переменная, сохраняющая в себе результат (true/false) функции isPrime
            if (num == true) { // если простое число 
                System.out.print(i); // вывести в консоль с текстом "... is prime"
                System.out.println(" is prime");
            }
        }
    }

    public static boolean isPrime(int n) { // функция, принимающая n, который будет вернхим порогом-1 при выводе в main
        int primeNum = 1; // дежурная переменная, с помощью которой будет проверяться условие
        for(int i = 2; i < n; i++) { // цикл от 2 до n (не включительно)
            if (n % i ==0) { // если n делится нацело без остатка
                primeNum = 0;
            }
        }
        if (primeNum == 1) {
            return true; // это простое число
        }
        else {
            return false; // это составное число
        }
    }
  
}