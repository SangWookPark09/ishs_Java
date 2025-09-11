import java.util.Scanner;

public class PrimeGame {
    //숫자 하나를 넘겨 받아서 해당 수가 소수면 true 리턴, 소수가 false
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i = i + 1) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers = {111, 977, 1, 2, 53, 1200};
//        for (int i = 0; i < 6; i = i + 1) {
//            if (isPrime(numbers[i])) {
//                System.out.println(numbers[i] + " is a prime number~");
//            } else {
//                System.out.println(numbers[i] + " is not prime number!");
//            }
//        }
        for (int number : numbers) { // range bassed for
            if (isPrime(number)) {
                System.out.println(number + " is a prime number~");
            } else {
                System.out.println(number + " is not prime number!");
            }
        }
    }
}
