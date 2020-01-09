package se.lexicon.todo_it.model;

public class Person {
    private final int personId= 1;
    private int id;
    private String firstName;
    private String lastName;

    public Person(int personId, String firstName, String lastName) {
        this.id = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
