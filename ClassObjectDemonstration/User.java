public class User
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    /**
     * Constructor for objects of class User
     */
    public User(String theName, int theAge)
    {
        age = theAge;
        name = theName;
    }
    
    public String getUserName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
}
