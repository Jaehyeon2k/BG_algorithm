import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // 첫 번째 줄: 정수의 개수 N 입력
        int N = scn.nextInt();

        // 두 번째 줄: N개의 정수를 입력받아 배열에 저장
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scn.nextInt();
        }

        // 세 번째 줄: 찾으려는 정수 v 입력
        int v = scn.nextInt();

        // v의 개수를 세는 변수
        int count = 0;
        for (int num : numbers) {
            if (num == v) {
                count++;
            }
        }

        // 결과 출력
        System.out.println(count);

        scn.close(); // Scanner 닫기
    }
}