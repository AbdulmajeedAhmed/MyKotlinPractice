package DataStructuresAndAlgorithms.DataStructureImplementation.LinkedListU

import DataStructuresAndAlgorithms.DataStructureImplementation.Stack.StackLinkedList.StackLinkedList

object Quiz{
    @JvmStatic fun main(args:Array<String>){
        val lk1= MyLinkedList()




        lk1.add(1)
        lk1.add(5)
        lk1.add(10)
        lk1.add(15)
        lk1.add(20)
        val stack= StackLinkedList()




        stack.push(5)
        stack.push(11)
        stack.push(12)
        stack.push(13)
        stack.push(14)
        lk1.displayElements()
        stack.displayElements()

        println()

        val combinedLinkedList= MyLinkedList().combineLinkedLists(lk1,stack)
        combinedLinkedList.displayElements()

    }

}