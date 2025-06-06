import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();  // 첫 번째 주사위
        int b = sc.nextInt();  // 두 번째 주사위
        int c = sc.nextInt();  // 세 번째 주사위
        int reward;

        if (a == b && b == c) {
            // 같은 눈 3개
            reward = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // 같은 눈 2개 (a 기준)
            reward = 1000 + a * 100;
        } else if (b == c) {
            // 같은 눈 2개 (b 기준)
            reward = 1000 + b * 100;
        } else {
            // 모두 다른 눈
            int max = Math.max(a, Math.max(b, c));
            reward = max * 100;
        }

        System.out.println(reward);
    }
}
