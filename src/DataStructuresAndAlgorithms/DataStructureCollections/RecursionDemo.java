package DataStructuresAndAlgorithms.DataStructureCollections;

public class RecursionDemo {
    private int num=4;

     private void recursionTest(){
        if(num==0)
            return;
            System.out.println(num);
            num--;
            recursionTest();
    }

    public static void main(String[]args){
        new RecursionDemo().recursionTest();
    }
}
