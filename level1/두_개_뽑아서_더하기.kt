class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        for (idx1 in numbers.indices) {
            for (idx2 in numbers.indices) {
                if(idx1 >= idx2) continue

                val sum = numbers[idx1] + numbers[idx2]
                if (!answer.contains(sum)) answer.add(sum)
            }
        }

        answer.sort()
        return answer.toIntArray()
    }
}
