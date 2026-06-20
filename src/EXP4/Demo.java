package EXP4;

public class Demo
{
    public int a = 10;          // Public Access Specifier
    private int b = 20;         // Private Access Specifier
    protected int c = 30;       // Protected Access Specifier
    int d = 40;                 // Default Access Specifier

    final String college = "CDGI";   // Non-Access Specifier (final)

    void display()
    {
        System.out.println("Public Variable = " + a);
        System.out.println("Private Variable = " + b);
        System.out.println("Protected Variable = " + c);
        System.out.println("Default Variable = " + d);
        System.out.println("College = " + college);
    }
}