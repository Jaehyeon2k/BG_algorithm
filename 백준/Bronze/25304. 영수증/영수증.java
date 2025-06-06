import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int X = s.nextInt(); // 영수증 총 금액
        int N = s.nextInt(); // 구매한 물건 종류 수

        int total = 0;

        for (int i = 0; i < N; i++) {
            int a = s.nextInt(); // 물건 가격
            int b = s.nextInt(); // 물건 개수
            total += a * b;       // 누적 합계 계산
        }

        if (total == X) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
