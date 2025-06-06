import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // A, B, C 입력받기
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        // (A+B)%C
        System.out.println((A + B) % C);

        // ((A%C) + (B%C))%C
        System.out.println(((A % C) + (B % C)) % C);

        // (A×B)%C
        System.out.println((A * B) % C);

        // ((A%C) × (B%C))%C
        System.out.println(((A % C) * (B % C)) % C);

        scn.close(); // Scanner 닫기
    }
}