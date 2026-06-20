package EXP5;

public class Singleton
{
    private static Singleton obj;

    // Private Constructor
    private Singleton()
    {
        System.out.println("Singleton Object Created");
    }

    public static Singleton getInstance()
    {
        if(obj == null)
        {
            obj = new Singleton();
        }
        return obj;
    }
}