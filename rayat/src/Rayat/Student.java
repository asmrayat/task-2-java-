package Rayat;

public class Student {

    /*
    Name: Rayat
    Id: 2012020162
    Email: cse_2012020162@lus.ac.bd
    */

    String name;
    int id;
    static String universityName;
    Student()
    {
        Student.universityName="Leading University";
    }
    Student(String s, int b)
    {
        this.name=s;
        this.id=b;
    }
    Student(int b, String s)
    {
        this.name=s;
        this.id=b;
    }
    void display()
    {
        System.out.println(this.universityName);
    }
}
