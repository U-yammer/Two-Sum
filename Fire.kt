package leetCode

fun main() {
    val sol: Solution = Solution()

    val res: IntArray = IntArray(3)
    res[0] = 1
    res[1] = 2
    res[2] = 3

    sol.twoSum(res, 1)
}




class Solution {
    fun multiply(x: Double, y: Double): Double {
        return x * y
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res: IntArray = IntArray(2);
        var resIdx: Int = 0

        for ((index, elem) in nums.withIndex()) {
            for (i in nums.indices) {
                if (index != i) {
                    val ans: Int = elem + nums[i];
                    println(i)

                    if (ans == target) {
                        res[resIdx] = i
                        resIdx++
                    }
                }
            }
        }

        return res
    }
}