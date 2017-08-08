package DataStructuresAndAlgorithms

class TwoDArrays {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val nums = Array(2) { IntArray(2) }
            nums[0][0] = 1
            nums[0][1] = 2
            nums[1][0] = 3
            nums[1][1] = 4

            for ( i in 0..1) {
                for (j in 0..1) {
                    println(nums[i][j])
                }
            }
        }
    }
}