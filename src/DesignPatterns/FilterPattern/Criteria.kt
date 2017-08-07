package DesignPatterns.FilterPattern

import java.sql.PreparedStatement

interface Criteria{
    fun meetCriteria(persons: List<Person>):  ArrayList<Person>
}

class CriteriaMale : Criteria {
    override fun meetCriteria(persons: List<Person>):  ArrayList<Person> {
        val listOfMales= ArrayList<Person>()
        persons.filterTo(listOfMales) {
            it.gender.contentEquals("Male")
        }
        return listOfMales
    }
}
class CriteriaFemale : Criteria {
    override fun meetCriteria(persons: List<Person>):  ArrayList<Person> {
        val listOfFemales= ArrayList<Person>()
        persons.filterTo(listOfFemales) {
            it.gender.contentEquals("Female")
        }
        return listOfFemales
    }
}

class CriteriaSingle : Criteria {
    override fun meetCriteria(persons: List<Person>):  ArrayList<Person> {
        val listOfFemales= ArrayList<Person>()
        persons.filterTo(listOfFemales) {
            it.materialStatus.contentEquals("Single")
        }
        return listOfFemales
    }
}
class CriteriaMarried : Criteria {
    override fun meetCriteria(persons: List<Person>):  ArrayList<Person> {
        val listOfFemales= ArrayList<Person>()
        persons.filterTo(listOfFemales) {
            it.materialStatus.contentEquals("Married")
        }
        return listOfFemales
    }
}
class AndCriteria( val criteria1:Criteria,val criteria2:Criteria):Criteria {
    override fun meetCriteria(persons: List<Person>):  ArrayList<Person> =
            criteria2.meetCriteria(criteria1.meetCriteria(persons))
}


class ORCriteria( val criteria1:Criteria,val criteria2:Criteria):Criteria {

    override fun meetCriteria(persons: List<Person>): ArrayList<Person> {
        val listOfPeopleOfCriteria1 = criteria1.meetCriteria(persons) // people of c1
        val listOfPeopleOfCriteria2 = criteria2.meetCriteria(persons) // people of c2

        for (someOne in listOfPeopleOfCriteria2) { // for every one in c2 people , if it is not in c1 people, add it..
            if (!listOfPeopleOfCriteria1.contains(someOne)) {
                listOfPeopleOfCriteria1.add(someOne)
            }
        }

        return listOfPeopleOfCriteria1
    }
}
