import java.util.Scanner;

public class PrimeGame {
    public static boolean isPrime(int n) {
        //숫자 하나를 넘겨 받아서 해당 수가 소수면 true 리턴, 소수가 false
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int number = sc.nextInt();
        if(number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i = i + 1) {
                if (number % i == 0) {
                    isPrime = false; //counter = counter + 1
                    break;
                }
                //System.out.print(i + " ");
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number~");
        }else{
            System.out.println(number + " is not prime number!");
        }
    }
}
