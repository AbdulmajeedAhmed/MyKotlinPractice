package Others

fun main(args: Array<String>) {
val (firstTuple1Par,secondTuple1Par)= getTuple1()
val (firstTuple2Par,secondTuple2Par,thirdTuple2Par)= getTuple2()

    val listOfNumbers= 1..10
    for(i in listOfNumbers){
        println(i)
    }

    val countryAndCity = listOf(Pair("Madrid","Spain"), "Sanaa" to "Yemen")
    for ((country,city) in countryAndCity){
        println("Country is $country and city is $city")
    }

}

fun getTuple1():Pair<String, Int>{
return Pair("test", 1)
}

fun getTuple2():Triple<String, Int,Boolean>{
return Triple("Test2",2,false)
}

