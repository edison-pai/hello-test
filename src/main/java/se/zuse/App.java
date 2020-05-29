package se.zuse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello, this is my first try!" );
        System.out.println("Hi,what is your name?");
        User user =new User();
        user.setName("张三");
        System.out.println("My name is "+user.getName());
    }
}
