package DataStructuresAndAlgorithms.DataStructureImplementation.Stack.StackArray


class StackArray(var size:Int){
//var arrayStack=Array(5,{0}) //{0} initialize all cells with 0, array of integers
    var arrayStack= arrayOfNulls<Any>(size) // all the cells are nulls.
    var top=-1

    fun isFull():Boolean= top==size-1 // array start from 0
    fun isEmpty():Boolean= top==-1


    fun pop():Any?{
        when(isEmpty()){
            true ->
            {
                val msg="The stack is empty!!"
                println(msg)
                return msg
            }
            else ->{
                // get the item in the cell top
                val item=arrayStack[top]
                top-=1
                return item
            }
        }
    }

    fun put(newItem:Any?){
        if(!isFull()){
            top++
            arrayStack[top]=newItem
        }else{
            println("The stack is full!")
        }
    }

    fun displayItems(){
        if(!isEmpty()){
            for(index in top downTo 0){
                println(arrayStack[index])
            }
        }else{
            println("The stack is empty. No elements to display.")
        }
    }
}