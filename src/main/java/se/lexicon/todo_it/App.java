package se.lexicon.todo_it;

import se.lexicon.todo_it.data.People;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static People people;
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Hello World!" );

        String firstName = "hala";

        System.out.println("skriv ditt namn");
        String name = scanner.next();

        System.out.println("hej " + name);
    }
}
