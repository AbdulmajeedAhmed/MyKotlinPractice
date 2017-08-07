package DesignPatterns.FlyweightPattern
/*
Flyweight pattern is primarily used to reduce the number of objects
created and to decrease memory footprint and increase performance.
This type of design pattern comes under structural pattern as this pattern
provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates
new object when no matching object is found.
 */
interface Shape{
    fun draw()
}

class Circle constructor(var color:String): Shape {
    private var x = 0
    private var y = 0
    private var radius = 0

    override fun draw() {
        println("Circle: Draw() with x = $x and y = $y and color = $color")
    }

    fun setX(x: Int) {
        this.x = x
    }

    fun setY(y: Int) {
        this.y = y
    }

    fun setRadius(radius: Int) {
        this.radius = radius
    }
}

    object ShapeFactory{ // because we wanna use all objects inside as static. + implementation of Singleton pattern.

        var CircleMap= hashMapOf<String,Circle>()

        fun getShape(color:String):Circle?
        {
            var circle:Circle?=CircleMap[color]
            when(circle){
             null -> { // it means this new circle, so now create new one and add it to the hash..
                 circle= Circle(color)
                 CircleMap.put(color, circle)
                 System.out.println("Creating circle of color : " + color)
                 return circle
             }
                else ->{
                    return circle // already created object, what we want to is just to change its attributes only and make as new object.
                }
            }

        }
    }//ShapeFactory

class FlyweightPatternDemo{ // or object FlyweightPatternDemo
    companion object {
        var colors= arrayOf("Green","Red","Black","Blue","White")

        @JvmStatic fun main(args: Array<String>) { // @JvmStatic is to use the main inside a class..
            for (i in 1..10) {
                val circle = ShapeFactory.getShape(getRandomColor()) //ShapeFactory() is WRONG, because you create new objects every time, so the solution is to make the access STATIC by using companion object or using object (Singleton).
                circle?.setX(getRandomXorY())
                circle?.setY(getRandomXorY())
                circle?.setRadius(100)
                circle?.draw()
                println()
            }
        }
        fun getRandomXorY(): Int = (Math.random() * 100).toInt()

        fun getRandomColor(): String = colors[(Math.random() * colors.size).toInt()]
    }

    private fun test(f:()->Int){

    }
}


