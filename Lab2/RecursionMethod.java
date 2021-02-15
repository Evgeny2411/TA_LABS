package Lab2;

public class RecursionMethod {
    public static void recursionMethod(double x, int n){
        double xi = x;
        if(xi != 0.0){
            n++;
            xi = new Formula().formula(xi, n);
            System.out.print(xi + " ");
            recursionMethod(xi, n);
        }
    }
}
