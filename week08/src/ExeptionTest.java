import java.util.Scanner;

public class ExeptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numerator : ");
        double numerator = scanner.nextDouble();
        System.out.println();
        System.out.print("Input denominator : ");
        double denominator = scanner.nextDouble();
        System.out.println();

        System.out.println(numerator/denominator);
    }
}
