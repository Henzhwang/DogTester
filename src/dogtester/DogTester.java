/*
 * @Henry Huang
 * DogTester.java
 * Mar 20,2019
 * This program is designed to display information about dogs such as its name, its
 * breed, its aggression and its hung. It also display Their bark in a friendly way 
 * and in an angry way.
 */

package dogtester;

/**
 *
 * @author hehua8751
 */
public class DogTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Dog dog1 = new Dog("Rover", "Spaniel", 8, 4);
    Dog dog2 = new Dog("Spot", "Border Collie");
    Dog dog3 = new Dog();

    //Print the details of each dog
    System.out.println(dog1.toString());
    System.out.println("--------------------------");

    System.out.println(dog2.toString());
    System.out.println("--------------------------");

    //toString() is called by default, no need to write it!
    System.out.println(dog3);
    System.out.println("--------------------------");

    //dog1 barks friendly, dog2 barks angry
    dog1.barkFriendly();
    dog2.barkAngry();
    }
    
}
