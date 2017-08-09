package DataStructuresAndAlgorithms.Queue.QueueLinkedList


fun main(args: Array<String>) {
    val queueLinkedList=QueueLinkedList()

    queueLinkedList.enqueue(1)
    queueLinkedList.enqueue(2)
    queueLinkedList.enqueue(3)
    queueLinkedList.enqueue(4)
    queueLinkedList.enqueue(5)
    println("Before deleting ")
    queueLinkedList.displayAllElements()
    println("After deleting ")
    queueLinkedList.dequeue()
    queueLinkedList.dequeue()
    queueLinkedList.dequeue()
    queueLinkedList.dequeue()
    queueLinkedList.dequeue()
    queueLinkedList.dequeue()
    queueLinkedList.enqueue(5555)
    queueLinkedList.enqueue(5555555555)
    queueLinkedList.dequeue()
    queueLinkedList.displayAllElements()

}