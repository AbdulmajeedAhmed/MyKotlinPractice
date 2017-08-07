package DesignPatterns.FilterPattern

import java.util.ArrayList



fun main(args: Array<String>) {
    val persons = ArrayList<Person>()
    persons.add(Person("Robert","Male", "Single"))
    persons.add(Person("John", "Male", "Married"))
    persons.add(Person("Laura", "Female", "Married"))
    persons.add(Person("Diana", "Female", "Single"))
    persons.add(Person("Mike", "Male", "Single"))
    persons.add(Person("Bobby", "Male", "Single"))

    val male = CriteriaMale()
    println("Males: ")
    printPersons(male.meetCriteria(persons))

    val female = CriteriaFemale()
    println("\nFemales: ")
    printPersons(female.meetCriteria(persons))

    val single = CriteriaSingle() // this criteria will be joined with another criteria.
    val married = CriteriaMarried() // this criteria will be joined with another criteria.

    val singleMale = AndCriteria(single,male)
    println("\nSingle Males: ")
    printPersons(singleMale.meetCriteria(persons));

    val singleOrFemale = ORCriteria(single, female)
    println("\nSingle Or Females: ")
    printPersons(singleOrFemale.meetCriteria(persons))

    val marriedAndFemale = AndCriteria(married, female)
    println("\nMarried And Females: ")
    printPersons(marriedAndFemale.meetCriteria(persons))


}
fun printPersons(persons:List<Person> ){

    for (person in persons) {
        println("Person : [ Name : ${person.name} , Gender : ${person.gender}, Marital Status : ${person.materialStatus} ]")
    }
}