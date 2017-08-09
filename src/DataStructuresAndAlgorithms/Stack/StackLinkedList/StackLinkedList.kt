package DataStructuresAndAlgorithms.Stack.StackLinkedList

// The idea is to think about pointers and BUILD every thing from pointing!!.
class StackLinkedList{
    private var top:Node?=null // It is a pointer. NOTING MORE!

    fun push(value:Any){
        val newNode=Node(value,null)
        if(top==null){
            top=newNode
        }
        else{
            newNode.next=top
            top=newNode
        }
    }

    fun pop():Any?{
        when(top){
            null -> {
                val msg="The stack is empty. Noting to retrieve."
                return msg
            }
            else ->{
                val value=top?.value
                top=top?.next
                return value
            }
        }
    }
    fun displayElements(){
        if(top==null){
            println("The stack is empty.")
        }else{
            var tmpPointer=top // if you do not make tmp pointer, you will LOOSE all DATA!!
            while (tmpPointer!=null){
                println(tmpPointer.value)
                tmpPointer=tmpPointer.next

            // If you do the following, you will lose the 'top' and then loose every thing...
           /* while (top!=null){
                println(top?.value)
                top= top?.next
            }*/
        }
    }


}
}