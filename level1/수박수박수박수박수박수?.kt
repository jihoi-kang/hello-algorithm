class Solution {
    fun solution(n: Int): String {
        val text = "수박"
        val textCount = n / 2

        return StringBuilder().apply {
            var count = 0
            while (textCount > count++) {
                append(text)
            }
            if ((n % 2) == 1) {
                append("수")
            }
        }.toString()
    }
}
