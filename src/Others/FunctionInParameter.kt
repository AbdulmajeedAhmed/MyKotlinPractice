package Others

fun main(args: Array<String>) {
    // invoking
   // highOrder(::sum)

    // using Lambda
    highOrder({x,y -> x+y}) // without coding the function ..
}

fun highOrder(func:(Int,Int)->Int){
    println(func(3,22))

}

/*fun sum(nu1:Int,nu2:Int):Int{
    return nu1+nu2
}*/
