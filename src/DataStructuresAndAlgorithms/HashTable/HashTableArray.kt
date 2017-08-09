package DataStructuresAndAlgorithms.HashTable
/*
The implementation of the hash table will be using Array.
You can use anything else to implement the hash with.

Very interesting data structure.!!!!
 */
class HashTableArray(var size:Int){
    var arrayHash :Array<Node?> = arrayOfNulls(size)

    init {
        for (i in arrayHash.indices)
            arrayHash[i]= Node()
    }

    fun hashKey(key:Int):Int=key%size // to hash the key, and bound to any key entered by the user

    fun put(key:Int,value:Any){
        /* Trace the following on piece of paper*/
        // 1-create new node..
        var newNode=Node(key,value)

        // 2-hash the key
        var hashedKey=hashKey(key)

        // 3-get old node in the array
        var oldNode=arrayHash[hashedKey]

        // 4-make our new node to pointers to what the old node points to.
        newNode.next=oldNode?.next

        // 5-make the old node to points to the new node.
        oldNode?.next=newNode

        /*
        if you wanna make adding the node be in the end of the linked list, just comment 4 & 5 and
        replace them by the following code..

         if(oldNode?.next!=null){
            oldNode?.next?.next=newNode // here to put the new node at the end if the old node does not pointers to null.
        }else{
            // 4-make our new node to pointers to what the old node points to.
            newNode.next=oldNode?.next
            // 5-make the old node to points to the new node.
            oldNode?.next=newNode
        }
         */
    }
    fun get(key:Int):Any{
        var value:Any?=null

        // 1-get the hashed key in order to refer to the cell that you saved your node in.
        var hashedKey=hashKey(key)

        // 2-get the node at the hashedkey cell.
        var ourNode=arrayHash[hashedKey]

        // 3- loop through the linkedList until you find.
        while (ourNode!=null){
            if(ourNode.getNodeKey()==key){
                value=ourNode.getNodeValue()
                break
            }
            ourNode=ourNode.next
        }
        when(value){
            null -> return "Sorry, no entry is found"
            else -> return value
        }
    }
    fun displayElementByKey(key:Int){
        println("The result: ${get(key)}")
    }

    fun displayAllElements(){

        for(i in 0 until size){ // i in [1, size), size is excluded

            while (arrayHash[i]?.next!=null){ // trace it !
                arrayHash[i]=arrayHash[i]?.next
                println(arrayHash[i]?.getNodeValue())
            }
        }
    }
}