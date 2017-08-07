package DesignPatterns.FactoryPattern

interface Shape{

    fun draw()

}

class Rectangle: Shape {
    override fun draw() {
        println("This is Rectangle")
    }
}

private class Circle : Shape {
    override fun draw() {
        println("This is Circle")
    }
}
class Square: Shape {
    override fun draw(){
        println("This is Square")
    }
}

open class ShapeFactory{
    fun getShape(shapeType:String): Shape? = shapeType.let {
        when(shapeType){
            "CIRCLE","circle" -> return Circle()
            "RECTANGLE","rectangle" -> return Rectangle()
            "SQUARE","square" -> return Square()
            else -> return null
        }
    }
}

fun main(args: Array<String>) {
    ShapeFactory().getShape("circle")?.draw()
    ShapeFactory().getShape("rectangle")?.draw()
    ShapeFactory().getShape("square")?.draw()
}