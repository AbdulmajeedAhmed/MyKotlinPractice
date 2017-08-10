package DataStructuresAndAlgorithms.DataStructureImplementation.Queue.QueueArray

class QueueArray(var size:Int){
    private var front=-1
    private var rear=-1
    var arrayQueue= arrayOfNulls<Any>(size)

    fun isFull():Boolean= rear==size-1

    fun isEmpty():Boolean= front==-1
    fun isBecomeEmpty():Boolean=front>rear

    fun inqueue(value:Any){
        if(!isFull()){
            front=0
            rear++
            arrayQueue[rear]=value
        }else{
            println("You can not add at this time.")
        }
    }

    fun dequeue(): Any? {
        var value:Any?=null
        if(!isEmpty()){
            value= arrayQueue[front] as Any
            arrayQueue[front]=null
            front++
        }else{
            println("It is empty!!!!")
        }
        if(isBecomeEmpty()){
            front=-1
            rear=-1
        }
        return value
    }

    fun displayAllItems(){
        (0..size-1)
                .filter { arrayQueue[it]!=null }
                .forEach { println(arrayQueue[it]) }
    }


}