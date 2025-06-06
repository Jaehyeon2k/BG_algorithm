import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) { // EOF까지 계속 읽기
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }

        sc.close();
    }
}
