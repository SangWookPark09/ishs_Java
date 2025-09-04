import java.sql.SQLOutput;
import java.util.Scanner;

public class GugudanGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("단을 입력하세요 : ");
        int dan = scanner.nextInt();
        if(dan < 2 || dan > 9) {
            System.out.println("단은 2~9 사이의 값입니다.");
        }else {
            for (int i = 1; i < 10; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }
    }
}
