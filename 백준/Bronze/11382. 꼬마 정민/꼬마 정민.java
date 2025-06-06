import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // A, B, C 입력받기
        long A = scn.nextLong(); // 큰 수를 처리하기 위해 long 타입 사용
        long B = scn.nextLong();
        long C = scn.nextLong();

        // 세 수의 합 계산
        long result = A + B + C;

        // 결과 출력
        System.out.println(result);

        
    }
}