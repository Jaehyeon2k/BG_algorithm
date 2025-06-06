import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();  // 현재 시
        int B = sc.nextInt();  // 현재 분
        int C = sc.nextInt();  // 요리 시간 (분)

        // 현재 시간을 총 분 단위로 환산 후 요리 시간 더하기
        int totalMinutes = A * 60 + B + C;

        // 다시 시와 분으로 환산
        int endHour = (totalMinutes / 60) % 24; // 24시간제이므로 24로 나눈 나머지
        int endMinute = totalMinutes % 60;

        System.out.println(endHour + " " + endMinute);
    }
}