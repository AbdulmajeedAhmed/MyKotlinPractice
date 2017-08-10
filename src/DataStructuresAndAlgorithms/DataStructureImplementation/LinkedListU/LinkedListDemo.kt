package DataStructuresAndAlgorithms.DataStructureImplementation.LinkedListU

object LinkedListDemo{
    @JvmStatic fun main(args: Array<String>) {
        val linkedList= MyLinkedList() //linkedList of any type!!!
        linkedList.add('a')
        linkedList.add(4)
        linkedList.add(true)
        linkedList.add(645.3)
        linkedList.add("5")
        println("Before deleting")
        linkedList.displayElements()
        println("After deleting")
        linkedList.delete()
        linkedList.displayElements()

    }
}