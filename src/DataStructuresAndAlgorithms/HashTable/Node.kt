package DataStructuresAndAlgorithms.HashTable

class Node() {
    private var key:Int?=null
    private var value:Any?=null
    var next:Node?=null

    constructor(key:Int,value:Any):this(){
        this.key=key
        this.value=value
    }

    fun getNodeKey():Int?=this.key
    fun getNodeValue():Any?=value


}