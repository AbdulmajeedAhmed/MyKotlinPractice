package DesignPatterns.FacadePattern
/*
Facade pattern hides the complexities
of the system and provides an interface to
the client using which the client can access
the system. This type of design pattern comes
under structural pattern as this pattern adds an
interface to existing system to hide its complexities.
 */
interface Shape{
    fun draw();
}

class Rectangle : Shape{
    override fun draw(){
        println("Rectangle::draw()")
    }
}
class Circle : Shape{
    override fun draw(){
        println("Circle::draw()")
    }
}
class Square : Shape{
    override fun draw(){
        println("Square::draw()")
    }
}

class ShapeMaker{
    var circle: Shape?=null
    var rectangle: Shape?=null
    var square: Shape?=null
    init {
        rectangle= Rectangle()
        circle= Circle()
        square= Square()
    }

    fun drawRectangle(){
        rectangle?.draw()
    }
    fun drawCircle(){
        circle?.draw()
    }
    fun drawSquare(){
        square?.draw()
    }
}


fun main(args: Array<String>){
    val shapeMaker=ShapeMaker()
    shapeMaker.drawCircle()
    shapeMaker.drawRectangle()
    shapeMaker.drawSquare()
}