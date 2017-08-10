package DataStructuresAndAlgorithms.DataStructureImplementation.Stack.StackArray

fun main(args: Array<String>) {
    val stack1= StackArray(5)
    stack1.put(newItem = 1)
    stack1.put(newItem = 2)
    stack1.put(newItem = 3)
    stack1.put(newItem = 4)
    stack1.put(newItem = 5)
    println("Before popping")
    stack1.displayItems()
    stack1.pop()
    println("After popping")
    stack1.displayItems()
    println("----------------------")

    /*  val stack2=StackArray(5)
      for(item in 1..stack1.size){
          stack2.put(stack1.pop())
      }

      stack2.put(5)
      stack2.put(55)
      stack2.displayItems()*/
}