package DataStructuresAndAlgorithms.LinkedListU

class MyLinkedList {
    private var head:Node? = null

    @Throws(Exception::class) // this for throwing exception
    fun add(value:Any){
        val newNode=Node(value,null)

        if(head==null){
            head=newNode
        }else{
            newNode.next=head
            head=newNode
        }
    }

    fun delete(){ // delete first element in the linked list and so BigOh = O(1)
        head=head?.next
    }

    fun displayElements(){
        var node=head
        while (node!=null){
            println(node.value)
            node=node.next
        }
    }
}