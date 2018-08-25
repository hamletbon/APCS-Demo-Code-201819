
/**
 * Write a description of class HelloWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelloWorld
{
    public static void main(String[] args)
    {
        User sausage = new User("臘腸", 12);
        User gundum = new User("Original Gundum", 50);
        System.out.println(sausage.getUserName() +", age: "+ sausage.getAge());
        System.out.println(gundum.getUserName() +", age: "+ gundum.getAge());}
}
