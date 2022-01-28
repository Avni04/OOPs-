package oopsconcept;

public class MethodOverloading {

    static int divMethod(int x, int y){
        return x/y;
    }
    static double doubleMethod(double a,double b){
        return a + b;
    }

    public static void main(String[] args) {
        int n = divMethod(10,5);
        double d=doubleMethod(25.50,45.85);
        System.out.println("int = " + n);
        System.out.println("double= " + d);

    }
}
