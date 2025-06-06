import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // 첫 번째 숫자 (1)의 위치에 들어갈 세 자리 수 입력
        int num1 = scn.nextInt();
        
        // 두 번째 숫자 (2)의 위치에 들어갈 세 자리 수 입력
        int num2 = scn.nextInt();

        // 곱셈 과정의 각 단계 계산
        int digit1 = num2 % 10; // (3) 두 번째 숫자의 1의 자리
        int digit2 = (num2 / 10) % 10; // (4) 두 번째 숫자의 10의 자리
        int digit3 = num2 / 100; // (5) 두 번째 숫자의 100의 자리
        int result = num1 * num2; // (6) 최종 곱셈 결과

        // 결과 출력
        System.out.println(num1 * digit1); // (3)
        System.out.println(num1 * digit2); // (4)
        System.out.println(num1 * digit3); // (5)
        System.out.println(result); // (6)

        scn.close(); // Scanner 닫기
    }
}