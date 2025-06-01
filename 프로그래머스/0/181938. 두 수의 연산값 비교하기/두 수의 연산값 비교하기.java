class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int s1 = 2*b*a;
        int s2 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        if (s1 > s2)
            answer = s1;
        else
            answer = s2;
        return answer;
    }
}