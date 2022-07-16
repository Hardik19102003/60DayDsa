class Bank{
    int p = 100;
    int n = 1;

    void intrest(double r){
        System.out.println(p*r*n/100);
    }
}

public class Rate {
    public static void main(String[] args) {
        Bank A = new Bank();
        A.intrest(6);
        Bank B = new Bank();
        B.intrest(5.8);
        Bank C = new Bank();
        C.intrest(10.12);
    }
}
