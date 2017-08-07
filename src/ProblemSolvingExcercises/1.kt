package ProblemSolvingExcercises

import java.util.*

fun main(args: Array<String>) {
 /*   // q1
    println("Enter a number:")
    val number= readLine()!!.toInt()
    for(i in 1..10){
        println("$number X $i = ${number*i} ")
    }*/


    for (i in 1..4){ //4 rows
        for(k in 1..25){ // 25 columns
            when(i)
            {
                1 -> { // row 1
                    when(k){
                        4 -> print("J") // row 4
                        9 -> print("a")
                        13 -> print("v")
                        19 -> print("v")
                        22 -> print("a")
                        else -> print(" ") // print empty
                    }
                }
                2 -> {
                    when(k) {
                        4 -> print("J")
                        8 -> print("a")
                        10 -> print("a")
                        14 -> print("v")
                        18 -> print("v")
                        21 -> print("a")
                        23 -> print("a")
                        else -> print(" ")
                    }
                }
                3 ->{
                    when(k) {
                        1 -> print("J")
                        4 -> print("J")
                        in 7..11 -> print("a")
                        15 -> print("V")
                        17 -> print("V")
                        in 20..24 -> print("a")
                        else -> print(" ")
                    }
                }
                4 ->{
                    when(k) {
                        2 -> print("J")
                        3 -> print("J")
                        6 -> print("a")
                        12 -> print("a")
                        16 -> print("V")
                        19 -> print("a")
                        25 -> print("a")
                        else -> print(" ")
                    }
                }
            }
        }
        println() // new line is necessary..
    }

}