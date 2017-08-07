package DesignPatterns.ProxyPattern

abstract class Image{
    var fileName:String=""
    abstract fun display()
}

class RealImage(IFileName: String) : Image() {

    init { // Here to initialize any code , consider it here that you initialize IFileName and call loadFromDisk(fileName) together like what you did in java inside the constructor.
        fileName=IFileName // by inheritance...
        loadFromDisk(fileName)
    }

    override fun display() {
        println("Displaying $fileName")
    }
    fun loadFromDisk(fileName:String){
        println("Loading $fileName")
    }
}

class ProxyImage(var IFileName:String) : Image(){
    private var realImage:RealImage?=null

    init {
        fileName= IFileName
    }

    override fun display() {
        when(realImage){
            null ->{
                realImage= RealImage(IFileName)
            }
        }
        realImage?.display()
    }
}

fun main(args: Array<String>) {
    val image=ProxyImage("test.jpg")

    //image will be loaded from disk
    image.display()
    System.out.println("")

    //image will not be loaded from disk
    image.display()

}