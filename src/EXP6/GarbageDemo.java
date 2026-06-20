package EXP6;

public class GarbageDemo
{
    int id;

    GarbageDemo(int x)
    {
        id = x;
    }

    void display()
    {
        System.out.println("Object ID = "+id);
    }

    @Override
    protected void finalize()
    {
        System.out.println("Garbage Collector destroyed Object ID = "+ id);
    }
}
