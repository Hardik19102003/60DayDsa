//class Area {
//    public double circumference(double l, double b) {
//        return 2 * (l + b);
//    }
//
//    public double circumference(double r) {
//        return 2 * 3.14 * r;
//    }

//    public double area (double length, double width)
//    {
//        return length*width;
//
//    }
//    public double area_cir (double radius)
//    {
//        return 2*3.14*radius*radius;
//    }
//}

class A {
    int a;
    String b;
    A(){};
        A(int a) {
            System.out.println(a);
        }
        A(String b) {
            System.out.println(b);
        }
}
public class Exercise4 {
    public static void main(String[] args) {
        A a1 = new A(1);
        System.out.println(a1.a);
        A a2 = new A("f");
        System.out.println(a2.b);
    }
}