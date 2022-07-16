class Data{
    String name;
    int StdId;

    void Display(){
        System.out.println("My name is : " + this.name + " and Id :" + this.StdId);
    }

    void Display(String name){
        System.out.println("My Student Id is : " + this.StdId + " and Name :" + name);
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Data s1 = new Data();
        s1.name = "Dhyani";
        s1.StdId = 23242;
        s1.Display();

        Data s2 = new Data();
        s2.name = "Nency";
        s2.StdId = 22342;
        s2.Display(s2.name);
    }
}
