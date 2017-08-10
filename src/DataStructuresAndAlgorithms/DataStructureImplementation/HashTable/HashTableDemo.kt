package DataStructuresAndAlgorithms.DataStructureImplementation.HashTable

fun main(args: Array<String>) {
    val myHashTable= HashTableArray(3)
    myHashTable.put(10,"Majeed")
    myHashTable.put(661,"Ali")
    myHashTable.put(342,"Badr")
    myHashTable.put(2,"test")
   // myHashTable.displayElementByKey(22)
    myHashTable.displayAllElements()

}