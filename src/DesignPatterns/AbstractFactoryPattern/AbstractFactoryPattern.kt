package DesignPatterns.AbstractFactoryPattern

interface Shape{
    fun draw()
}
 class Rectangle: Shape {
     override fun draw() {
    println("This is Rectangle")
     }
}

 class Circle : Shape {
    override fun draw() {
        println("This is Circle")
    }
}
 class Square: Shape {
    override fun draw(){
        println("This is Square")
    }
}

interface Color{
    fun fill()

}

class Red: Color {
    override fun fill() {
        println("This is Red")
    }
}

class Black : Color {
    override fun fill() {
        println("This is Black")
    }
}
class Blue: Color {
    override fun fill(){
        println("This is Blue")
    }
}

  class ShapeFactory: AbstractFactory() {
      override fun getShape(shapeType:String): Shape? {
          when (shapeType) {
              "CIRCLE", "circle" -> return Circle()
              "RECTANGLE", "rectangle" -> return Rectangle()
              "SQUARE", "square" -> return Square()
              else -> return null
          }
      }
      override fun getColor(colorType:String): Color? {
          return null
      }
}
 class ColorFactory: AbstractFactory() {
    override fun getColor(colorType:String): Color? {
         when(colorType){
                    "RED","red" -> return Red()
                    "BLACK","black" -> return Black()
                    "BLUE","blue" -> return Blue()
                    else -> return null
            }
    }

     override fun getShape(shape: String): Shape? {
         return null
     }
}
abstract open class AbstractFactory{
    abstract fun getShape(shape:String):Shape?
    abstract fun getColor(color:String):Color?
}

class FactoryProducer{
    fun getFactory(factoryType:String):AbstractFactory?{
        when(factoryType){
            "COLOR","color" -> return ColorFactory()
            "SHAPE","shape" -> return ShapeFactory()
            else -> return null
        }
    }
}



fun main(args:Array<String>){
    FactoryProducer().getFactory("COLOR")?.getColor("red")?.fill()
    FactoryProducer().getFactory("COLOR")?.getColor("blue")?.fill()
    FactoryProducer().getFactory("COLOR")?.getColor("black")?.fill()
    println("------------------------------------------------------")
    FactoryProducer().getFactory("shape")?.getShape("circle")?.draw()
    FactoryProducer().getFactory("shape")?.getShape("rectangle")?.draw()
    FactoryProducer().getFactory("shape")?.getShape("square")?.draw()
}