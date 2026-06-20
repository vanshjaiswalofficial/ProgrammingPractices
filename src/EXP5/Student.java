package EXP5;

class Address
{
    String city;

    Address(String city)
    {
        this.city = city;
    }
}

public class Student
{
    int rollNo;
    String name;
    Address address;

    // Parameterized Constructor
    Student(int rollNo, String name, Address address)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    // Deep Copy Constructor
    Student(Student s)
    {
        rollNo = s.rollNo;
        name = s.name;
        address = new Address(s.address.city);
    }

    void display()
    {
        System.out.println("Roll No = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("City = " + address.city);
    }
}