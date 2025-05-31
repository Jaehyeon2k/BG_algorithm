class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String front = my_string.substring(0, s); // front값은 my_string 문자열을 0부터 2 이전까지
        String back = my_string.substring(s + overwrite_string.length()); // back값은 2 + 7 = 9이다. 즉, "d" 이다.
        return front + overwrite_string + back;
    }
}