package EXP8;

interface Sports
{
    void sportsMarks();
}

interface Academic
{
    void academicMarks();
}

// Multiple Inheritance using Interfaces
public class InterfaceDemo implements Sports, Academic
{
    public void sportsMarks()
    {
        System.out.println("Sports Marks = 85");
    }

    public void academicMarks()
    {
        System.out.println("Academic Marks = 90");
    }

    void display()
    {
        System.out.println("Student Performance");
    }
}