package ProblemSolvingExcercises

fun main(args: Array<String>) {
    println("Enter a number:")
    val row= readLine()!!.toInt()
var empty =7
    val column=row+empty
var space=1

    outer@ for (i in 1..row){
        if(empty>=0) {
            inner@ for (k in 1..column) {
                when (k) {
                    in 1..empty -> {
                        print(" ")
                    }
                    empty + 1 -> {
                        for (w in 1 ..space+1) {
                            if(w%2!=0)
                                print("$i")
                            else
                                print(" ")
                        }
                        space+=2
                        empty--
                        break@inner
                    }


                }

            }
            println()
        }
        //
        else{
            for (w in 1 ..space+1) {
                if(w%2!=0)
                    print("$i")
                else
                    print(" ")
            }
            println()
        }

    }
}