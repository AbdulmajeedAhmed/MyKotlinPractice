package Others

internal interface test {
    fun d()

    companion object {
        val x = 3
    }
}

internal class t : test {

    override fun d() {

    }

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println(test.x)
        }
    }
}