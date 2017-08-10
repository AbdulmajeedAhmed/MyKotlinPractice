package DataStructuresAndAlgorithms.DataStructureImplementation.LinkedListU

import DataStructuresAndAlgorithms.DataStructureImplementation.Stack.StackLinkedList.StackLinkedList

class MyLinkedList {
    private var head: Node? = null //It is a pointer. NOTING MORE!

    @Throws(Exception::class) // this for throwing exception
    fun add(value:Any?){
        val newNode= Node(value, null)

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
            when(node.next){
               null ->  print("${node.value}") // just for the ,
                else -> print("${node.value},")
            }
            node=node.next
        }
        println()
    }
    fun displayLastElement(): Any? {
        var tmp=head
        while (tmp?.next!=null){
            tmp=tmp.next
        }
        return tmp?.value
    }

    fun combineLinkedLists(lk1: MyLinkedList, stack: StackLinkedList): MyLinkedList {
       val combinedLinkedList= MyLinkedList()
        var tmp1=lk1.head

            while (tmp1!=null){
                combinedLinkedList.add(tmp1.value)
                combinedLinkedList.add(stack.pop())
                tmp1=tmp1.next
            } // tmp now


        return combinedLinkedList
    }
}