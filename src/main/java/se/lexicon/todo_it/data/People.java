package se.lexicon.todo_it.data;

import se.lexicon.todo_it.model.Person;

import java.util.Arrays;

public class People {
    private static Person[] persons = new Person[0];



    public int size(){
        return persons.length;
    }

    public Person[] findAll(){
        return persons;
    }

    public Person findById(int personId){
        for (Person p: persons
             ) {
            if (personId == p.getId()){
                return p;
            }
        }
        return null;
    }

    public Person createNewPerson(String firstName, String lastName){
        int newLength = persons.length + 1;
        Person newPerson = new Person(firstName,lastName);

        persons = Arrays.copyOf(persons, newLength);
        persons[persons.length]= newPerson;
        return newPerson;
    }

    public void clear(){
        persons = new Person[0];
    }
}
