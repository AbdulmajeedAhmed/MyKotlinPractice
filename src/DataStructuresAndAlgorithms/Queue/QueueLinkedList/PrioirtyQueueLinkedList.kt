/*
package DataStructuresAndAlgorithms.Queue.QueueLinkedList

class PrioirtyQueueLinkedList {
    var front: Node2? = null
    var rear: Node2? = null

    fun enqueue(value: Int) {
        val newNode = Node2(value, null)

        if (front == null) { // no elements yet...
            front = newNode
            rear = newNode
        } else {
            rear?.next = newNode
            rear = newNode //rear not front!
        }
    }

    fun dequeue(): Int? {
        var value: Int? = null
        if (front != null) {
            value = front?.value
            front = front?.next
            if (front == null) { // delete last element
                rear = null
            }
        } else {
            println("The queue is empty!!!")
        }
        return value
    }

    fun displayAllElements() {
        var tmp = front
        while (tmp != null) {
            println(tmp.value)
            tmp = tmp.next
        }
    }

    fun priorityEnqueue(value: Int) {
        val newNode = Node2(value, null)
        if (front == null) { // no elements yet...
            front = newNode
            rear = newNode
        } else {
            val rearVal =rear?.value as Int

      */
/*      if (front?.value?.compareTo(1)> 0) { // normal
                rear?.next = newNode
                rear = newNode //rear not front!
            }*//*

        }

        var tmp = front

    }

}




*/
