package EXP3;

public class Student
{
    int rollNo;
    String name;

    void getData(int r, String n)
    {
        rollNo = r;
        name = n;
    }

    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
    }
}