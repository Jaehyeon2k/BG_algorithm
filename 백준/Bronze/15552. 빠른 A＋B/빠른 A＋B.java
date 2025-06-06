import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력용 버퍼 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력용 버퍼 설정
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 첫 줄: 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String[] parts = br.readLine().split(" "); // 공백 기준 분리
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            bw.write((A + B) + "\n"); // 결과 출력 (버퍼에 저장)
        }

        bw.flush(); // 출력 버퍼 한 번에 전송
        bw.close(); // 출력 스트림 닫기
        br.close(); // 입력 스트림 닫기
    }
}