import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int sum = A + B;

            // printf로 형식 지정 출력
            System.out.printf("Case #%d: %d + %d = %d\n", i, A, B, sum);
        }

        sc.close(); // Scanner 종료
    }
}
