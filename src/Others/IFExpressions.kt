package Others

fun main(args: Array<String>) {
    expression1(input = 15 )
}

fun expression1(input:Int){
    val result= if(input>10) {
        println("this is the first if")
        100
    }else{
        "this is string returned. not int because result is Any"
    }
    println(result)
}

