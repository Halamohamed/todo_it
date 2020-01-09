package se.lexicon.todo_it.data;

import se.lexicon.todo_it.model.Person;

import java.util.Arrays;

import static se.lexicon.todo_it.data.PersonSequencer.nextPersonId;

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
        int length = persons.length ;
        Person newPerson = new Person(nextPersonId(), firstName,lastName);

        persons = Arrays.copyOf(persons, persons.length+1);
        persons[length]= newPerson;
        return newPerson;
    }

    public void clear(){
        persons = new Person[0];
    }

    public int indexOfPersonId(int personId){
        int index = -1;
        for(int i=0; i<persons.length; i++){
            if(persons[i].getId() == personId){
                index= i;
            }
        }
        return index;

    }
    public boolean removePerson(int personId){
        int index = indexOfPersonId(personId);
        if(index == -1){
            return false;
        }
        persons = remove(index);
        return true;
    }

    private Person[] remove(int index) {
        Person[] first = Arrays.copyOfRange(persons,0,index);
        Person[] last = Arrays.copyOfRange(persons, index+1,persons.length);
        Person[] combined = Arrays.copyOf(first,first.length+last.length);
        System.arraycopy( last, 0, combined, first.length, first.length+last.length );
        return combined;
    }
}
