package DesignPatterns.BuilderPattern

fun main(args: Array<String>) {
   var meal1= MeallBuilder().prepareVegMeal()
    println("Veg Meal");
    meal1.showItems()
    println("The total cost is ${meal1.getCost()}")


    var meal2=MeallBuilder().prepareNonVegMeal()
    println("\nNon Veg Meal");
    meal2.showItems()
    println("The total cost is ${meal2.getCost()}")
}