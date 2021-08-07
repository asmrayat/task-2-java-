package Rayat;

public class Main {

    /*
    Name: Rayat
    Id: 2012020162
    Email: cse_2012020162@lus.ac.bd
    */
    public static void main(String[] args) {
	// write your code here
        Student ob1=new Student();
        Student ob2=new Student("Rayat", 2012020162);
        Student ob3=new Student(2012020184, "Saif");

        ob1.display();
        ob2.display();
        ob3.display();
    }
}
