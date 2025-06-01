class Solution {
    public int solution(int a, int b) {
        // a ⊕ b : 문자열로 이어붙인 뒤 숫자로 변환
        int ab = Integer.parseInt("" + a + b);
        int ba = Integer.parseInt("" + b + a);

        // 더 큰 값을 반환 (같으면 ab)
        int answer = Math.max(ab, ba);
        return answer;
    }
}