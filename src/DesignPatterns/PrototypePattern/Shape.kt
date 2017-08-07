package DesignPatterns.PrototypePattern

abstract class Shape {

    private var id: String? = null

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    var type: String? = null
        protected set

    internal abstract fun draw() // internal means we can use this function within the same module.

}

class Circle : Shape() { // inherit Shape




    override fun draw() {
        println("Inside Rectangle::draw() method.");    }
    init {
        type="Circle"
    }

}

class Square  : Shape(){

    init {
        type="Square "
    }
    override fun draw() {
        println("Inside Square ::draw() method.");    }
}

class Rectangle  : Shape(){

    init {
        type="Rectangle"
    }
    override fun draw() {
        println("Inside Rectangle::draw() method.");    }
}

