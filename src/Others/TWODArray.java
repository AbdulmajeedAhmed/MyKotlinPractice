package Others;


import DataStructuresAndAlgorithms.HashTable.Node;

public class TWODArray {
    public static int nums[][]= new int[2][3];
    // equivalence to:   val nums = Array(3) { IntArray(3) } in Kotlin.

    public static void main(String[]args){
       Node[] a= new Node[3];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                System.out.println(nums[i][j]);
            }
        }
    }

}
