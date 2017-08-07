package DesignPatterns.PrototypePattern

class ShapeCache {
    companion object { // all what inside this object is static
        private var hashMap:HashMap<String?,Shape> = HashMap()

        fun getShape(shapeID:String)= hashMap[shapeID]

        fun loadShape(){
            var circle:Circle= Circle()
            circle.setId("1")
            hashMap[circle.getId()] = circle

            var rectangle:Rectangle= Rectangle()
            rectangle.setId("2")
            hashMap[rectangle.getId()] = rectangle

            var square:Square= Square()
            square.setId("3")
            hashMap[square.getId()] = square
        }
    }
}

fun main(args: Array<String>) {
    ShapeCache.loadShape()

    var clonedShape1= ShapeCache.getShape("1") as Shape // casting

    System.out.println("${clonedShape1.type} id is ${clonedShape1.getId()}")







  /*  var clonedShape2= ShapeCache.getShape("2") as Shape // casting
    System.out.println("Shape : " + clonedShape2.type)

    var clonedShape3= ShapeCache.getShape("3") as Shape // casting
    System.out.println("Shape : " + clonedShape3.type)*/
}