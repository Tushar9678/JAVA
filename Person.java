/*Problem Statement: Class and Constructor
Create a class called Person that represents a person, with properties for their name and age. The Person class should have a constructor that takes two parameters: a String for the person's name and an int for their age. The constructor should set the initial values of the name and age properties based on the passed-in values.
Once you have created the Person class and its constructor, create two Person objects: one representing a person named "Alice" who is 25 years old, and another representing a person named "Bob" who is 30 years old. Then print out the name and age properties of each Person object.*/


public class Person{
    String name;
    int age;

    //Constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public static void main(String [] args){
        //object creation
        Person obj1 = new Person("Alice" , 25); 
        Person obj2 = new Person("Bob", 30);

        //print
        System.out.println("Person1 :");
        System.out.println("Name :" +obj1.getname());
        System.out.println("Age : "+obj1.getage());

        System.out.println("Person2 :");
        System.out.println("Name :" +obj2.getname());
        System.out.println("Age : "+obj2.getage());


    }

}