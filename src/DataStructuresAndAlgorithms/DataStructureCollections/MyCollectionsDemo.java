package DataStructuresAndAlgorithms.DataStructureCollections;
import java.util.*;

public class MyCollectionsDemo {

    public static void main(String[]args){
       MyCollectionsDemo test = new  MyCollectionsDemo();
        // test.arrayList();
        // test.arrayList2();
        // test.linkedList();
        // test.hashMap();
        // test.treeSet(); // HashSet is the same accept the data is not ordered.
        // test.stack();
        //test.queue();
        test.priorityQueue();


    }

    private void priorityQueue() {
       // The peek() method is used to look at the object at the top of this stack without removing it from the stack.
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(100);
        pq.add(1000);
        pq.add(10000);
        System.out.println("Priority queue..");
        System.out.println(pq.poll());

        // But when you have object type, how to compare priority????
        // By implementing Comparable class that have compareTo method that determines the priority.
        // You decide then what the priority will be on...

        System.out.println("Priority queue with comparable implementation..");
        PriorityQueue<Employee> pq2 = new PriorityQueue<Employee>();
        pq2.add(new Employee("Ali",23000));
        pq2.add(new Employee("Mohammed",35000));
        pq2.add(new Employee("Nasser",87000));

        System.out.println(pq2.poll().salary); //pq2.poll() Remember, this returns an Employee.


    }

    private void queue() {
        Queue<Integer>q= new LinkedList<Integer>(); // queue is implemented using LinkedList.
        q.add(1);
        q.add(10);
        q.add(100);
        q.add(1000);

        System.out.println("Normal queue..");
        System.out.println(q.poll());

      /*  for(Integer qq:q){
            System.out.println(qq);

        }*/


    }

    private void stack() {
        Stack<Integer> st= new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        for(Integer d:st){
            System.out.println(d);

        }

    }

    private void treeSet() {
        TreeSet<Integer> ts= new TreeSet<Integer>(); // ordered....
        ts.add(1);
        ts.add(73);
        ts.add(7577);
        ts.add(1);

        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

        }
    }

    private void hashMap() {
        HashMap<Integer,String > hm= new HashMap<Integer,String>();
        hm.put(1,"Ali1");
        hm.put(2,"Ali2");
        hm.put(3,"Ali3");
        hm.put(4,"Ali4");

        for(Map.Entry m : hm.entrySet()){
            System.out.println("key is "+ m.getKey()+" and value is "+ m.getValue());
        }
    }

    private void linkedList() {
        LinkedList<Integer> lk= new LinkedList<Integer>();
        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(4);
        lk.add(5);

        Iterator it = lk.iterator(); // cant
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }


    private  void arrayList() {
        ArrayList arrayList= new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add(3.9);
        arrayList.add(false);
        for(Object s: arrayList){
            System.out.println(s);
        }

        ArrayList emps= new ArrayList<Employee>();
        Employee d= (new Employee("Ali",12));
        emps.add(d);
        emps.add(new Employee("Ali2",122));
        emps.add(new Employee("Ali3",12222));
        emps.add(new Employee("Ali4",122222));

    }
    private void arrayList2() {
        ArrayList<Employee> emps= new ArrayList<Employee>(); //ArrayList<Emp>  is neeedddddeddd....... otherwise object is returned..
        emps.add(new Employee("Ali2",122));
        emps.add(new Employee("Ali3",12222));
        emps.add(new Employee("Ali4",122222));
        for(int i=0; i<emps.size(); i++){
            System.err.println(emps.get(i).name);
        }

        for (Employee em:emps) {
            System.out.println(em.name);
        }
    }
}
