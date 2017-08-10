package DataStructuresAndAlgorithms.DataStructureCollections;

import org.jetbrains.annotations.NotNull;

public class Employee implements Comparable { //implements Comparable for the usage of the priority queue only..
        public String name;
        int salary;

        Employee(String name, int salary){
            this.name=name;
            this.salary=salary;
        }

    @Override
    public int compareTo(@NotNull Object object) {
        if (object instanceof Employee) {

            if (this.salary == ((Employee) object).salary) {
                return 0;
            }
            else if (this.salary > ((Employee) object).salary) {
                return 1;
            }
           else {
                return -1;
            }
            // the retuns , that how this method works...
        }
        return 0;

    }
}

