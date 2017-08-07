package DesignPatterns.DecoratorPattern
/*
Decorator pattern allows a user to add new functionality
to an existing object without altering its structure.

This pattern creates a decorator class which wraps the original class and provides
additional functionality keeping class methods signature intact.
 */

interface Shape{
    fun draw();
}
class Circle : Shape {
    override fun draw(){
        System.out.println("Shape: Circle")
    }
}
class Square : Shape {
    override fun draw(){
        System.out.println("Shape: Square")
    }
}


open  class ShapeDecorator(decoratedShape: Shape) : Shape{
    var decoratedShape:Shape?= decoratedShape // so it can be inherited..
    protected set

    override fun draw() { // we call the normal draw function of the parent class.
        this.decoratedShape?.draw()
    }
}

class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape) {

    override fun draw() { // it is the same method in class Shape + my new functionality.
        decoratedShape?.draw()
        SetRedBorder()
    }

    private fun  SetRedBorder() {
        System.out.println("Border Color: Red");
    }

}

fun main(args: Array<String>) {
    System.out.println("Circle with normal border")
    Circle().draw()

    System.out.println("\nCircle of red border");
    RedShapeDecorator(Circle()).draw()
}


