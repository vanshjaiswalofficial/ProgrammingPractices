package EXP7;

// Parent Class
class Person
{
    void showPerson()
    {
        System.out.println("Person Class");
    }
}

// Single Inheritance
class Student extends Person
{
    void showStudent()
    {
        System.out.println("Student Class");
    }
}

// Multilevel Inheritance
class Result extends Student
{
    void showResult()
    {
        System.out.println("Result Class");
    }
}

// Hierarchical Inheritance
class Employee extends Person
{
    void showEmployee()
    {
        System.out.println("Employee Class");
    }
}