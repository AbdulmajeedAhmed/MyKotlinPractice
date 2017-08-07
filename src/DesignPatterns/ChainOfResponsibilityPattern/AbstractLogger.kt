package DesignPatterns.ChainOfResponsibilityPattern
/*
This is a little bit complicated pattern and needs to be traced or debugged in order to understand the logic very good.

As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
This pattern decouples sender and receiver of a request based on type of request.
This pattern comes under behavioral patterns.

In this pattern, normally each receiver contains reference to another receiver.
If one object cannot handle the request then it passes the same to the next receiver and so on.

*/
abstract class AbstractLogger{
    companion object {
        var INFO=1
        var DEBUG=2
        var ERROR=3
    }
    protected var level=0
    internal var nextLogger: AbstractLogger? = null

    fun setNextLogger(next:AbstractLogger){
        nextLogger=next
    }

    fun logMessage(level:Int, msg:String){
        if(this.level<=level){
            write(msg)
        }
        nextLogger?.let {
            nextLogger?.logMessage(level,msg)
        }
    }

    abstract protected fun write(msg:String)

}
class ConsoleLogger(level:Int) : AbstractLogger(){
    init {
        this.level=level // this.level is by inheritance.
    }

    override  fun write(msg: String) {
        System.out.println("Standard Console::Logger: " + msg)

    }

}

class ErrorLogger(level:Int) : AbstractLogger(){
    init {
        this.level=level // this.level is by inheritance.
    }

    override  fun write(msg: String) {
        System.out.println("Error Console::Logger: " + msg)
    }
}
class FileLogger (level:Int) : AbstractLogger(){
    init {
        this.level=level // this.level is by inheritance.
    }

    override  fun write(msg: String) {
        System.out.println("File::Logger: " + msg)
    }
}

class ChainPatternDemo {
    companion object {
        fun getChainOfLoggers(): AbstractLogger {
            val errorLogger: AbstractLogger = ErrorLogger(AbstractLogger.ERROR)
            val fileLogger: AbstractLogger = FileLogger(AbstractLogger.DEBUG)
            val consoleLogger: AbstractLogger = ConsoleLogger(AbstractLogger.INFO)

            // here we create the chain and here is the logic of the pattern.
            errorLogger.setNextLogger(fileLogger)
            fileLogger.setNextLogger(consoleLogger)
            return errorLogger
        }
        @JvmStatic fun main(args:Array<String>){
            val loggerChain=getChainOfLoggers()

            loggerChain.logMessage(AbstractLogger.INFO,"This is an information.\n")
            loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.\n")
            loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.\n3")
        }
    }





}
