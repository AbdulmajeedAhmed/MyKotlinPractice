package DataStructuresAndAlgorithms.Queue.QueueLinkedList

class QueueLinkedList{
    var front:Node?= null
    var rear:Node?=null

    fun enqueue(value:Any){
        val newNode=Node(value,null)

        if(front==null){ // no elements yet...
            front=newNode
            rear=newNode
        }else{
            rear?.next=newNode
            rear=newNode //rear not front!
        }
    }

    fun dequeue():Any?{
        var value:Any?=null
        if(front!=null){
            value=front?.value
            front=front?.next
            if(front==null){ // delete last element
                rear=null
            }
        }else{
            println("The queue is empty!!!")
        }
        return value
    }

    fun displayAllElements(){
        var tmp=front
        while(tmp!=null){
           println(tmp.value)
            tmp=tmp.next
        }
    }


    }
