// Method overloading is allows us to use
// same function with different functionality.
//implement : The return type of the overloaded function is different.
// The type of the parameters passed to the function are different.
//The number of parameters passed to the function are different
class Student{
    String name;
    int StdId;

    void Display(String name, int StdId){
        System.out.println("My name is : " + name + " and Id :" + StdId);
    }

    void Display(int StdId, String name){
        System.out.println("My Student Id is : " + StdId + " and Name :" + name);
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Devansh";
        s1.StdId = 201203102;
        s1.Display(s1.name, s1.StdId);

        Student s2 = new Student();
        s2.name = "Vivek";
        s2.StdId = 210301232;
        s2.Display(s2.StdId, s2.name);
    }
}
