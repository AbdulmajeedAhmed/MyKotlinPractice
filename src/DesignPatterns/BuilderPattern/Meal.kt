package DesignPatterns.BuilderPattern

import java.util.ArrayList


class Meal {
    private val items = ArrayList<Item>()

    fun addItem(item: Item) {
        items.add(item)
    }

    fun getCost() = items.map { it.price() }.sum()

    fun showItems() {

        for (item in items) {
            println("Item : " + item.name())
            println(", Packing : " + item.packing().pack())
            println(", Price : " + item.price())
        }
    }
}
    class MeallBuilder{
      fun prepareVegMeal():Meal{
          val meal = Meal()
          meal.addItem(VegBurger())
          meal.addItem(Coke())
          return meal
      }

        fun  prepareNonVegMeal():Meal{
            val meal = Meal()
            meal.addItem(ChickenBurger())
            meal.addItem(Pepsi())
            return meal
        }
    }

