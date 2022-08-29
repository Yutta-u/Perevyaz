import java.util.Scanner;

public class Perevyaz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int x = a / 10;
        int z = a % 10;

        if (z == 0) {
            System.out.println(x);
        } else {
            System.out.println(x + 1);
        }
    }
}
