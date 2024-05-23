package io.indisp

fun main() {
    val solution = Solution()
    println(solution.findStrobogrammatic(3))
}

class Solution {
    val nums = mutableMapOf('0' to '0', '1' to '1', '6' to '9', '8' to '8', '9' to '6')
    fun findStrobogrammatic(n: Int): List<String> {
        val result = mutableSetOf<String>()
        fun dfs(limit: Int, s: String) {
            if (limit == n) {
                if (isValid(s))
                    result.add(s)
                return
            }

            for ((key, value) in nums) {
                dfs(limit + 1, s + "$key")
            }
        }
        dfs(0, "")
        return result.filterNot { it.length > 1 && it.startsWith('0') }.toList()
    }

    private fun isValid(num: String): Boolean {
        var left = 0
        var right = num.lastIndex
        while (left <= right) {
            if (!nums.containsKey(num[left]) || !nums.containsKey(num[right]))
                return false
            if (num[left] != nums[num[right]])
                return false
            left += 1
            right -= 1
        }
        return true
    }
}