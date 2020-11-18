class Solution {
    fun solution(s: String): String =
        if (s.length % 2 == 0) {
            val value = s.length / 2
            s.substring(value - 1, value + 1)
        } else {
            val value = s.length / 2
            s.substring(value, value + 1)
        }
}
