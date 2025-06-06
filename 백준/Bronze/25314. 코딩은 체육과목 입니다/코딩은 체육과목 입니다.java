import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 입력된 바이트 수

        int count = N / 4;

        for (int i = 0; i < count; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}